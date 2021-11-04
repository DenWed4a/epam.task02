package by.epam.task02.dao.dom;

import by.epam.task02.dao.dom.impl.LaptopParser;
import by.epam.task02.dao.dom.impl.OvenParser;
import by.epam.task02.dao.dom.impl.RefrigeratorParser;
import by.epam.task02.dao.dom.impl.SpeakersParser;
import by.epam.task02.dao.dom.impl.TabletPCParser;
import by.epam.task02.dao.dom.impl.VacuumCleanerParser;

public class ApplianceParserFactory {
	
	private final static ApplianceParserFactory instance = new ApplianceParserFactory();
	
	private final OvenParser ovenParser = new OvenParser();
	private final TabletPCParser tabletPCParser = new TabletPCParser();
	private final LaptopParser laptopParser = new LaptopParser();
	private final RefrigeratorParser refrigeratorParser = new RefrigeratorParser();
	private final SpeakersParser speakersParser = new SpeakersParser();
	private final VacuumCleanerParser vacuumCleanerParser = new VacuumCleanerParser();
	
	private ApplianceParserFactory() {}
	
	public static ApplianceParserFactory getInstance() {
		return instance;
	}

	public OvenParser getOvenParser() {
		return ovenParser;
	}

	public TabletPCParser getTabletPCParser() {
		return tabletPCParser;
	}

	public LaptopParser getLaptopParser() {
		return laptopParser;
	}

	public RefrigeratorParser getRefrigeratorParser() {
		return refrigeratorParser;
	}

	public SpeakersParser getSpeakersParser() {
		return speakersParser;
	}

	public VacuumCleanerParser getVacuumCleanerParser() {
		return vacuumCleanerParser;
	}
	
	
	

}
