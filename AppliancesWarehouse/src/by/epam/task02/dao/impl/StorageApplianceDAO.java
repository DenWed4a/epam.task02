package by.epam.task02.dao.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.xml.sax.SAXException;

import by.epam.task02.dao.ApplianceDAO;
import by.epam.task02.dao.TemporaryStorage;
import by.epam.task02.dao.dom.impl.XMLReader;
import by.epam.task02.dao.dom.impl.XMLWriter;
import by.epam.task02.dao.exception.DAOException;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;

public class StorageApplianceDAO implements ApplianceDAO{
	TemporaryStorage storage = TemporaryStorage.getInstance();
	private XMLWriter writer;
	{
		XMLReader reader = new XMLReader();
		try {
			reader.readDocument();
		} catch (ParserConfigurationException e) {
			throw new DAOException(e);
			
		} catch (SAXException e) {
			throw new DAOException(e);
			
		} catch (IOException e) {
			throw new DAOException(e);
			
		}
		writer = new XMLWriter();
	}

	@Override
	public List<Appliance> find(Criteria criteria) throws DAOException {
		Finder finder = new Finder();
		List<Appliance> result =  new ArrayList<Appliance>();
		Map<String, Object> params = criteria.getCriteria();
		String groupSearchName = criteria.getGroupSearchName();
		
		if(params.size() == 0 && groupSearchName != null) {
			result = finder.findByName(storage.getApplianceStorage(), groupSearchName);
		}else if(params.size() != 0 && groupSearchName == null) {
			result = finder.findByParams(storage.getApplianceStorage(), params);
		}else if(params.size() != 0 && groupSearchName != null){
			result = finder.findByNameAndParams(storage.getApplianceStorage(), groupSearchName, params);
		}else {
			result = storage.getApplianceStorage();
		}
		
		return result;
	}

	@Override
	public void add(Appliance appliance) throws DAOException{
		try {
			
			writer.write(appliance);
			
		} catch (ParserConfigurationException e) {
			throw new DAOException(e);
			
		} catch (IOException e) {
			throw new DAOException(e);
			
		} catch (TransformerException e) {
			throw new DAOException(e);
		}
		
	}

}
