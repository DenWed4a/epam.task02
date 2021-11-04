package by.epam.task02.dao.dom.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import by.epam.task02.dao.dom.ApplianceParserToXML;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.TabletPC;

public class TabletPCParserToXML extends ApplianceParserToXML {
private by.epam.task02.entity.criteria.SearchCriteria.TabletPC tabletPCCriteria;
	
	public Element parseToXML(Appliance appliance, Document document) {
		TabletPC tabletPC = (TabletPC) appliance;
		
		Element tabletPCElement = document.createElement("TabletPC");
		
		Element batteryCapacity = document.createElement(tabletPCCriteria.BATTERY_CAPACITY.toString());
		batteryCapacity.setTextContent(""+tabletPC.getBatteryCapacity());
		tabletPCElement.appendChild(batteryCapacity);
		
		Element displayInches = document.createElement(tabletPCCriteria.DISPLAY_INCHES.toString());
		displayInches.setTextContent(""+tabletPC.getDisplayInches());
		tabletPCElement.appendChild(displayInches);

		Element memoryRom = document.createElement(tabletPCCriteria.MEMORY_ROM.toString());
		memoryRom.setTextContent(""+tabletPC.getMemoryRom());
		tabletPCElement.appendChild(memoryRom);
		
		Element flashMemoryRom = document.createElement(tabletPCCriteria.FLASH_MEMORY_CAPACITY.toString());
		flashMemoryRom.setTextContent(""+tabletPC.getFlashMemoryRom());
		tabletPCElement.appendChild(flashMemoryRom);
		
		Element color = document.createElement(tabletPCCriteria.COLOR.toString());
		color.setTextContent(""+tabletPC.getColor());
		tabletPCElement.appendChild(color);

		
		return tabletPCElement;
	}
}
