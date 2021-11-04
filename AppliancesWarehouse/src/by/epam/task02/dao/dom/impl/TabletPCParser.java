package by.epam.task02.dao.dom.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import by.epam.task02.dao.TemporaryStorage;
import by.epam.task02.dao.dom.ApplianceParser;
import by.epam.task02.entity.TabletPC.Builder;
import by.epam.task02.entity.TabletPC;

public class TabletPCParser extends ApplianceParser {
	TemporaryStorage storage = TemporaryStorage.getInstance();
	TabletPC tabletPC;
	Builder builder = new TabletPC.Builder();
	public void parse(Document document) {
		
		NodeList elements = document.getElementsByTagName("TabletPC");
		for (int i = 0; i < elements.getLength(); i++) {
			
			Element elementTablet = (Element) elements.item(i);
			builder.batteryCapacity(
					Integer.parseInt(getSingleChild(elementTablet, "BATTERY_CAPACITY").getTextContent().trim()));
			builder.displayInches(
					Integer.parseInt(getSingleChild(elementTablet, "DISPLAY_INCHES").getTextContent().trim()));
			builder.memoryRom(
					Integer.parseInt(getSingleChild(elementTablet, "MEMORY_ROM").getTextContent().trim()));
			builder.flashMemoryRom(
					Integer.parseInt(getSingleChild(elementTablet, "FLASH_MEMORY_CAPACITY").getTextContent().trim()));
			builder.color(getSingleChild(elementTablet, "COLOR").getTextContent().trim());
			tabletPC = builder.build();
			storage.addAppliance(tabletPC);
			tabletPC = null;

		}

	}

}
