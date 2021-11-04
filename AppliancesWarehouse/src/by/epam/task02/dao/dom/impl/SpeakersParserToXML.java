package by.epam.task02.dao.dom.impl;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import by.epam.task02.dao.dom.ApplianceParserToXML;
import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Speakers;

public class SpeakersParserToXML extends ApplianceParserToXML {
	
private by.epam.task02.entity.criteria.SearchCriteria.Speakers speakersCriteria;
	
	public Element parseToXML(Appliance appliance, Document document) {
		Speakers speakers = (Speakers) appliance;
		
		Element speakersElement = document.createElement("Speakers");
		
		Element powerConsumption = document.createElement(speakersCriteria.POWER_CONSUMPTION.toString());
		powerConsumption.setTextContent(""+speakers.getPowerConsumption());
		speakersElement.appendChild(powerConsumption);
		
		Element numberOfSpeakers = document.createElement(speakersCriteria.NUMBER_OF_SPEAKERS.toString());
		numberOfSpeakers.setTextContent(""+speakers.getNumberOfSpeakers());
		speakersElement.appendChild(numberOfSpeakers);

		Element frequencyRange = document.createElement(speakersCriteria.FREQUENCY_RANGE.toString());
		frequencyRange.setTextContent(""+speakers.getFrequencyRange());
		speakersElement.appendChild(frequencyRange);

		Element cordLength = document.createElement(speakersCriteria.CORD_LENGTH.toString());
		cordLength.setTextContent(""+speakers.getCordLength());
		speakersElement.appendChild(cordLength);
		
		return speakersElement;
	}

}
