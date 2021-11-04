package by.epam.task02.dao.dom.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import by.epam.task02.dao.TemporaryStorage;
import by.epam.task02.dao.dom.ApplianceParser;
import by.epam.task02.entity.VacuumCleaner;
import by.epam.task02.entity.VacuumCleaner.Builder;

public class VacuumCleanerParser extends ApplianceParser {
	TemporaryStorage storage = TemporaryStorage.getInstance();
	VacuumCleaner vacuumCleaner;
	Builder builder = new VacuumCleaner.Builder();

	public void parse(Document document) {

		NodeList elements = document.getElementsByTagName("VacuumCleaner");
		for (int i = 0; i < elements.getLength(); i++) {

			Element elementVacuumCleaner = (Element) elements.item(i);

			builder.bagType(getSingleChild(elementVacuumCleaner, "BAG_TYPE").getTextContent().trim());
			builder.cleaningWidth(
					Integer.parseInt(getSingleChild(elementVacuumCleaner, "CLEANING_WIDTH").getTextContent().trim()));
			builder.powerConsumption(Integer
					.parseInt(getSingleChild(elementVacuumCleaner, "POWER_CONSUMPTION").getTextContent().trim()));
			builder.motorSpeedRegulation(Integer
					.parseInt(getSingleChild(elementVacuumCleaner, "MOTOR_SPEED_REGULATION").getTextContent().trim()));
			builder.filterType(getSingleChild(elementVacuumCleaner, "FILTER_TYPE").getTextContent().trim());
			builder.wandType(getSingleChild(elementVacuumCleaner, "WAND_TYPE").getTextContent().trim());
			
			vacuumCleaner = builder.build();
			storage.addAppliance(vacuumCleaner);
			vacuumCleaner = null;
			

		}
	}
}
