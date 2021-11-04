package by.epam.task02.main;

import java.util.List;

import by.epam.task02.entity.Appliance;

public class PrintApplianceInfo {
	
	public void printInfo(List<Appliance> list) {
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

}
