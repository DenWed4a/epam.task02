package by.epam.task02.dao.dom.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import by.epam.task02.dao.TemporaryStorage;
import by.epam.task02.dao.dom.ApplianceParser;
import by.epam.task02.entity.Refrigerator;
import by.epam.task02.entity.Refrigerator.Builder;

public class RefrigeratorParser extends ApplianceParser{

	TemporaryStorage storage = TemporaryStorage.getInstance();
	Refrigerator refrigerator;
	Builder builder = new Refrigerator.Builder();

	public void parse(Document document) {

		NodeList elements = document.getElementsByTagName("Refrigerator");

		for (int i = 0; i < elements.getLength(); i++) {
			Element elementRefrigerator = (Element) elements.item(i);
			
			builder.freezerCapacity(
					Integer.parseInt(getSingleChild(elementRefrigerator, "FREEZER_CAPACITY").getTextContent().trim()));
			builder.height(
					Integer.parseInt(getSingleChild(elementRefrigerator, "HEIGHT").getTextContent().trim()));
			builder.overallCapacity(
					Double.parseDouble(getSingleChild(elementRefrigerator, "OVERALL_CAPACITY" ).getTextContent().trim()));
			builder.powerConsumption(
					Integer.parseInt(getSingleChild(elementRefrigerator, "POWER_CONSUMPTION").getTextContent().trim()));
			builder.width(
					Integer.parseInt(getSingleChild(elementRefrigerator, "WIDTH").getTextContent().trim()));
			builder.weight(
					Integer.parseInt(getSingleChild(elementRefrigerator, "WEIGHT").getTextContent().trim()));
			refrigerator = builder.build();
			storage.addAppliance(refrigerator);
			refrigerator = null;
		}
	}
}