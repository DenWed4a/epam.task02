package by.epam.task02.dao.dom.impl;



import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import by.epam.task02.dao.TemporaryStorage;
import by.epam.task02.dao.dom.ApplianceParser;
import by.epam.task02.entity.Laptop;
import by.epam.task02.entity.Laptop.Builder;

public class LaptopParser extends ApplianceParser {
	private TemporaryStorage storage = TemporaryStorage.getInstance();
	private by.epam.task02.entity.criteria.SearchCriteria.Laptop laptopCriteria;

	public void parse(Document document) {
		NodeList elements = document.getElementsByTagName("Laptop");
		for (int i = 0; i < elements.getLength(); i++) {
			Laptop laptop;
			Builder builder = new Laptop.Builder();
			Element ovenElement = (Element) elements.item(i);
			builder.batteryCapacity(
					Double.parseDouble(getSingleChild(ovenElement, laptopCriteria.BATTERY_CAPACITY.toString()).getTextContent().trim()));
			builder.oS(getSingleChild(ovenElement, laptopCriteria.OS.toString()).getTextContent().trim());
			builder.memoryRom(Integer.parseInt(getSingleChild(ovenElement, laptopCriteria.MEMORY_ROM.toString()).getTextContent().trim()));
			builder.systemMemory(
					Integer.parseInt(getSingleChild(ovenElement, laptopCriteria.SYSTEM_MEMORY.toString()).getTextContent().trim()));
			builder.cPU(Double.parseDouble(getSingleChild(ovenElement, laptopCriteria.CPU.toString()).getTextContent().trim()));
			builder.displayInchs(
					Double.parseDouble(getSingleChild(ovenElement, laptopCriteria.DISPLAY_INCHS.toString()).getTextContent().trim()));
			laptop = builder.build();
			storage.addAppliance(laptop);
			
			
		}

	}
}