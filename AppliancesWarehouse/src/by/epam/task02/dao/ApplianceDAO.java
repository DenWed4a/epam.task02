package by.epam.task02.dao;

import java.util.List;

import by.epam.task02.dao.exception.DAOException;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;

public interface ApplianceDAO {
	public List<Appliance> find(Criteria criteria) throws DAOException ;
	
	public void add(Appliance appliance) throws DAOException;
	
	
}
