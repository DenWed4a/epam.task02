package by.epam.task02.dao.dom.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import by.epam.task02.dao.dom.ApplianceParserToXML;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Refrigerator;

public class RefrigeratorParserToXML extends ApplianceParserToXML{
private by.epam.task02.entity.criteria.SearchCriteria.Refrigerator refrigeratorCriteria;
	
	public Element parseToXML(Appliance appliance, Document document) {
		Refrigerator refrigerator = (Refrigerator) appliance;
		
		Element refrigeratorElement = document.createElement("Refrigerator");
		
		Element powerConsumption = document.createElement(refrigeratorCriteria.POWER_CONSUMPTION.toString());
		powerConsumption.setTextContent(""+refrigerator.getPowerConsumption());
		refrigeratorElement.appendChild(powerConsumption);
		
		Element weight = document.createElement(refrigeratorCriteria.WEIGHT.toString());
		weight.setTextContent(""+refrigerator.getWeight());
		refrigeratorElement.appendChild(weight);

		Element freezerCapacity = document.createElement(refrigeratorCriteria.FREEZER_CAPACITY.toString());
		freezerCapacity.setTextContent(""+refrigerator.getFreezerCapacity());
		refrigeratorElement.appendChild(freezerCapacity);
		
		Element overallCapacity = document.createElement(refrigeratorCriteria.OVERALL_CAPACITY.toString());
		overallCapacity.setTextContent(""+refrigerator.getOverallCapacity());
		refrigeratorElement.appendChild(overallCapacity);
		
		Element height = document.createElement(refrigeratorCriteria.HEIGHT.toString());
		height.setTextContent(""+refrigerator.getHeight());
		refrigeratorElement.appendChild(height);
	
		Element width = document.createElement(refrigeratorCriteria.WIDTH.toString());
		width.setTextContent(""+refrigerator.getWidth());
		refrigeratorElement.appendChild(width);
		
		return refrigeratorElement;
	}

}
