package by.epam.task02.dao.dom;

import by.epam.task02.dao.dom.impl.LaptopParserToXML;
import by.epam.task02.dao.dom.impl.OvenParserToXML;
import by.epam.task02.dao.dom.impl.RefrigeratorParserToXML;
import by.epam.task02.dao.dom.impl.SpeakersParserToXML;
import by.epam.task02.dao.dom.impl.TabletPCParserToXML;
import by.epam.task02.dao.dom.impl.VacuumCleanerParserToXML;

public final class ApplianceParserToXMLFactory {
	private final static ApplianceParserToXMLFactory instance = new ApplianceParserToXMLFactory();
	
	private final OvenParserToXML ovenParser = new OvenParserToXML();
	private final TabletPCParserToXML tabletPCParser = new TabletPCParserToXML();
	private final LaptopParserToXML laptopParser = new LaptopParserToXML();
	private final RefrigeratorParserToXML refrigeratorParser = new RefrigeratorParserToXML();
	private final SpeakersParserToXML speakersParser = new SpeakersParserToXML();
	private final VacuumCleanerParserToXML vacuumCleanerParser = new VacuumCleanerParserToXML();
	
	private ApplianceParserToXMLFactory() {}
	
	public static ApplianceParserToXMLFactory getInstance() {
		return instance;
	}
	
	public TabletPCParserToXML getTabletPCParser() {
		return tabletPCParser;
	}

	public LaptopParserToXML getLaptopParser() {
		return laptopParser;
	}

	public RefrigeratorParserToXML getRefrigeratorParser() {
		return refrigeratorParser;
	}

	public SpeakersParserToXML getSpeakersParser() {
		return speakersParser;
	}

	public VacuumCleanerParserToXML getVacuumCleanerParser() {
		return vacuumCleanerParser;
	}


	
	public OvenParserToXML getOvenParser() {
		return ovenParser;
	}
}
