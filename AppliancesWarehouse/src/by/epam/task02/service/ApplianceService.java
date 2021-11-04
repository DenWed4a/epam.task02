package by.epam.task02.service;

import java.util.List;

import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.service.exception.ServiceException;

public interface ApplianceService {
	
	public List<Appliance> find(Criteria criteria) throws ServiceException;
	public void add (Appliance appliance) throws ServiceException;

}
