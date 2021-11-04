package by.epam.task02.dao;

import by.epam.task02.dao.impl.StorageApplianceDAO;

public class DAOFactory {
    private final static DAOFactory dAOFactory =  new DAOFactory();
    
    private final ApplianceDAO applianceDAO = new StorageApplianceDAO();
    
    private DAOFactory() {}
    
    public static DAOFactory getDAOFactory() {
    	return dAOFactory;
    }

	public ApplianceDAO getApplianceDAO() {
		return applianceDAO;
	}
}
