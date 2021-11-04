package by.epam.task02.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import by.epam.task02.entity.Appliance;

public class Finder {

	public List<Appliance> findByName(List<Appliance> appliances, String name) {
		List<Appliance> result = new ArrayList<Appliance>();

		for (int i = 0; i < appliances.size(); i++) {
			if (appliances.get(i).toString().toUpperCase().contains(name.toUpperCase())) {
				result.add(appliances.get(i));
			}
		}
		return result;

	}

	public List<Appliance> findByParams(List<Appliance> appliances, Map<String, Object> params) {
		List<Appliance> result = new ArrayList<Appliance>();
		boolean itsRightAppliance;

		for (int i = 0; i < appliances.size(); i++) {
			itsRightAppliance = true;
			for (Map.Entry<String, Object> pair : params.entrySet()) {
				if (!appliances.get(i).toString().toUpperCase()
						.contains((pair.getKey() + "=" + pair.getValue()).toUpperCase())) {
					itsRightAppliance = false;
					break;
				}
			}
			if (itsRightAppliance) {
				result.add(appliances.get(i));
			}
		}
		return result;
	}
	
	public List<Appliance> findByNameAndParams(List<Appliance> appliances, String name, Map<String, Object> params){
		List<Appliance> result = new ArrayList<Appliance>();
		List<Appliance> temporaryList = new ArrayList<Appliance>();
		
		temporaryList = findByName(appliances, name);
		result = findByParams(temporaryList, params);
		
		return result;
		
		
	}
}
