package by.epam.task02.dao.dom.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import by.epam.task02.dao.TemporaryStorage;
import by.epam.task02.dao.dom.ApplianceParser;
import by.epam.task02.entity.Speakers;
import by.epam.task02.entity.Speakers.Builder;

public class SpeakersParser extends ApplianceParser {
	TemporaryStorage storage = TemporaryStorage.getInstance();
	Speakers speakers;
	Builder builder = new Speakers.Builder();

	public void parse(Document document) {

		NodeList elements = document.getElementsByTagName("Speakers");
		
		for (int i = 0; i < elements.getLength(); i++) {
			Element elementSpeakers = (Element) elements.item(i);
			
			builder.powerConsumption(
					Integer.parseInt(getSingleChild(elementSpeakers, "POWER_CONSUMPTION").getTextContent().trim()));
			builder.numberOfSpeakers(
					Integer.parseInt(getSingleChild(elementSpeakers, "NUMBER_OF_SPEAKERS").getTextContent().trim()));
			builder.cordLength(
					Double.parseDouble(getSingleChild(elementSpeakers, "CORD_LENGTH").getTextContent().trim()));
			builder.frequencyRange(
					getSingleChild(elementSpeakers, "FREQUENCY_RANGE").getTextContent().trim());
			speakers = builder.build();
			storage.addAppliance(speakers);
			speakers = null;
			
			/*			<element name="POWER_CONSUMPTION" type="int" />
			<element name="NUMBER_OF_SPEAKERS" type="int" />
			<element name="FREQUENCY_RANGE" type="string" />
			<element name="CORD_LENGTH" type="double" />*/
		}
	}
}
