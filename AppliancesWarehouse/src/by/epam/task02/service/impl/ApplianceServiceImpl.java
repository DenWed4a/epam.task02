package by.epam.task02.service.impl;

import java.util.List;

import by.epam.task02.dao.ApplianceDAO;
import by.epam.task02.dao.DAOFactory;
import by.epam.task02.dao.exception.DAOException;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.service.*;
import by.epam.task02.service.exception.ServiceException;

public class ApplianceServiceImpl implements ApplianceService {

	@Override
	public List<Appliance> find(Criteria criteria) throws ServiceException {
		List<Appliance> result;
		DAOFactory factory = DAOFactory.getDAOFactory();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		try{
			result = applianceDAO.find(criteria);
		}catch(DAOException e) {
			throw new ServiceException(e);
		}
		
		return result;
	}

	@Override
	public void add(Appliance appliance) throws ServiceException {
		DAOFactory factory = DAOFactory.getDAOFactory();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		try{
			applianceDAO.add(appliance);
		}catch(DAOException e) {
			throw new ServiceException(e);
		}

		
	}

}
