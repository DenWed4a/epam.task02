package by.epam.task02.dao.dom.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import by.epam.task02.dao.TemporaryStorage;
import by.epam.task02.dao.dom.ApplianceParser;
import by.epam.task02.entity.Oven;
import by.epam.task02.entity.Oven.Builder;

public class OvenParser extends ApplianceParser {

	TemporaryStorage storage = TemporaryStorage.getInstance();
	Oven oven;
	Builder builder = new Oven.Builder();

	public void parse(Document document) {

		NodeList elements = document.getElementsByTagName("Oven");
		
		for (int i = 0; i < elements.getLength(); i++) {
			Element elementOven = (Element) elements.item(i);
				builder.powerConsumption(
						Integer.parseInt(getSingleChild(elementOven, "POWER_CONSUMPTION").getTextContent().trim()));
				builder.capacity(
						Integer.parseInt(getSingleChild(elementOven, "CAPACITY").getTextContent().trim()));
				builder.depth(
						Integer.parseInt(getSingleChild(elementOven, "DEPTH").getTextContent().trim()));
				builder.weight(
						Integer.parseInt(getSingleChild(elementOven, "WEIGHT").getTextContent().trim()));
				builder.width(
						Double.parseDouble(getSingleChild(elementOven, "WIDTH").getTextContent().trim()));
				builder.height(
						Double.parseDouble(getSingleChild(elementOven, "HEIGHT").getTextContent().trim()));
				oven = builder.build();
				storage.addAppliance(oven);
				oven = null;			
		}
	}
}
