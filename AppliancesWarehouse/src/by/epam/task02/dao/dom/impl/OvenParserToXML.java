package by.epam.task02.dao.dom.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import by.epam.task02.dao.dom.ApplianceParserToXML;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Oven;

public class OvenParserToXML extends ApplianceParserToXML{
	
	public Element parseToXML(Appliance appliance, Document document) {
		Oven oven = (Oven) appliance;
		
		Element ovenElement = document.createElement("Oven");
		Element powerConsumption = document.createElement("POWER_CONSUMPTION");
		powerConsumption.setTextContent(""+oven.getPowerConsumption());
		ovenElement.appendChild(powerConsumption);
		
		Element weight = document.createElement("WEIGHT");
		weight.setTextContent(""+oven.getWeight());
		ovenElement.appendChild(weight);
		
		Element capacity = document.createElement("CAPACITY");
		capacity.setTextContent(""+oven.getCapacity());
		ovenElement.appendChild(capacity);
		
		Element depth = document.createElement("DEPTH");
		depth.setTextContent(""+oven.getDepth());
		ovenElement.appendChild(depth);
		
		Element height = document.createElement("HEIGHT");
		height.setTextContent(""+oven.getHeight());
		ovenElement.appendChild(height);
	
		Element width = document.createElement("WIDTH");
		width.setTextContent(""+oven.getWidth());
		ovenElement.appendChild(width);
		
		return ovenElement;
	}






}
