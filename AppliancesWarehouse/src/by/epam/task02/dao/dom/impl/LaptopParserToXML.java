package by.epam.task02.dao.dom.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import by.epam.task02.dao.dom.ApplianceParserToXML;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Laptop;

public class LaptopParserToXML extends ApplianceParserToXML{
	private by.epam.task02.entity.criteria.SearchCriteria.Laptop laptopCriteria;
	
	public Element parseToXML(Appliance appliance, Document document) {
		Laptop laptop = (Laptop) appliance;
		
		Element laptopElement = document.createElement("Laptop");
		Element batteryCapacity = document.createElement(laptopCriteria.BATTERY_CAPACITY.toString());
		batteryCapacity.setTextContent(""+laptop.getBatteryCapacity());
		laptopElement.appendChild(batteryCapacity);
		
		Element oS = document.createElement(laptopCriteria.OS.toString());
		oS.setTextContent(""+laptop.getoS());
		laptopElement.appendChild(oS);
		
		Element memoryRom = document.createElement(laptopCriteria.MEMORY_ROM.toString());
		memoryRom.setTextContent(""+laptop.getMemoryRom());
		laptopElement.appendChild(memoryRom);
		
		Element systemMemory = document.createElement(laptopCriteria.SYSTEM_MEMORY.toString());
		systemMemory.setTextContent(""+laptop.getSystemMemory());
		laptopElement.appendChild(systemMemory);
		
		Element cPU = document.createElement(laptopCriteria.CPU.toString());
		cPU.setTextContent(""+laptop.getcPU());
		laptopElement.appendChild(cPU);
	
		Element displayInches = document.createElement(laptopCriteria.DISPLAY_INCHS.toString());
		displayInches.setTextContent(""+laptop.getDisplayInches());
		laptopElement.appendChild(displayInches);
		
		return laptopElement;
	}
}
