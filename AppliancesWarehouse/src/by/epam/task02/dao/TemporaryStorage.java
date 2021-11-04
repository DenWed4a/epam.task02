package by.epam.task02.dao;

import java.util.ArrayList;
import java.util.List;

import by.epam.task02.entity.Appliance;

public class TemporaryStorage {
	private final static TemporaryStorage instance = new TemporaryStorage();
	private static List<Appliance> applianceStorage = new ArrayList<Appliance>();
	
	private TemporaryStorage(){}
	
	public static TemporaryStorage getInstance() {
		return instance;
	}
	
	
	public void addAppliance(Appliance appliance) {
		applianceStorage.add(appliance);
	}

	public TemporaryStorage(List<Appliance> applianceStorage) {
		TemporaryStorage.applianceStorage = applianceStorage;
	}

	public List<Appliance> getApplianceStorage() {
		return applianceStorage;
	}

	public void setApplianceStorage(List<Appliance> applianceStorage) {
		TemporaryStorage.applianceStorage = applianceStorage;
	}

}
