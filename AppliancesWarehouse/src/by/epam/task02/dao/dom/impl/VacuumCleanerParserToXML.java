package by.epam.task02.dao.dom.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import by.epam.task02.dao.dom.ApplianceParserToXML;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.VacuumCleaner;

public class VacuumCleanerParserToXML extends ApplianceParserToXML{

private by.epam.task02.entity.criteria.SearchCriteria.VacuumCleaner vacuumCleanerCriteria;
	
	public Element parseToXML(Appliance appliance, Document document) {
		VacuumCleaner vacuumCleaner = (VacuumCleaner) appliance;
		
		Element vacuumCleanerElement = document.createElement("VacuumCleaner");
		
		Element powerConsumption = document.createElement(vacuumCleanerCriteria.POWER_CONSUMPTION.toString());
		powerConsumption.setTextContent(""+vacuumCleaner.getPowerConsumption());
		vacuumCleanerElement.appendChild(powerConsumption);
		
		Element filterType = document.createElement(vacuumCleanerCriteria.FILTER_TYPE.toString());
		filterType.setTextContent(""+vacuumCleaner.getFilterType());
		vacuumCleanerElement.appendChild(filterType);

		Element bagType = document.createElement(vacuumCleanerCriteria.BAG_TYPE.toString());
		bagType.setTextContent(""+vacuumCleaner.getBagType());
		vacuumCleanerElement.appendChild(bagType);
		
		/*	<element name="POWER_CONSUMPTION" type="int" />
			<element name="FILTER_TYPE" type="string" />
			<element name="BAG_TYPE" type="string" />
			<element name="WAND_TYPE" type="string" />
			<element name="MOTOR_SPEED_REGULATION" type="int" />
			<element name="CLEANING_WIDTH" type="int" />*/
		
		Element wandType = document.createElement(vacuumCleanerCriteria.WAND_TYPE.toString());
		wandType.setTextContent(""+vacuumCleaner.getWandType());
		vacuumCleanerElement.appendChild(wandType);
		
		Element motorSpeedRegulation = document.createElement(vacuumCleanerCriteria.MOTOR_SPEED_REGULATION.toString());
		motorSpeedRegulation.setTextContent(""+vacuumCleaner.getMotorSpeedRegulation());
		vacuumCleanerElement.appendChild(motorSpeedRegulation);
		
		Element cleaningWidth = document.createElement(vacuumCleanerCriteria.CLEANING_WIDTH.toString());
		cleaningWidth.setTextContent(""+vacuumCleaner.getCleaningWidth());
		vacuumCleanerElement.appendChild(cleaningWidth);

		
		return vacuumCleanerElement;
	}

}
