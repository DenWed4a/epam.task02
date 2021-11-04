package by.epam.task02.service;

import by.epam.task02.service.impl.ApplianceServiceImpl;

public class ServiceFactory {
	
	private final static ServiceFactory instance = new ServiceFactory();
	
	private final ApplianceService applianceService = new ApplianceServiceImpl();
	
	private ServiceFactory() {}
	
	public static ServiceFactory getInstance() {
		return instance;
	}
	
	public ApplianceService getApplianceService() {
		return applianceService;
	}

}
