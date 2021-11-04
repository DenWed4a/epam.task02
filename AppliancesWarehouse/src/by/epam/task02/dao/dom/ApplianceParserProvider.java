package by.epam.task02.dao.dom;

import java.util.HashMap;
import java.util.Map;

import by.epam.task02.entity.Appliance;
import by.epam.task02.entity.Laptop;
import by.epam.task02.entity.Oven;
import by.epam.task02.entity.Refrigerator;
import by.epam.task02.entity.Speakers;
import by.epam.task02.entity.TabletPC;
import by.epam.task02.entity.VacuumCleaner;

public class ApplianceParserProvider {
	
	private Map<String, ApplianceParserToXML> provider = new HashMap<String, ApplianceParserToXML>();
	
	public ApplianceParserProvider() {
		provider.put(Oven.class.getSimpleName(), ApplianceParserToXMLFactory.getInstance().getOvenParser());
		provider.put(TabletPC.class.getSimpleName(), ApplianceParserToXMLFactory.getInstance().getTabletPCParser());
		provider.put(Laptop.class.getSimpleName(), ApplianceParserToXMLFactory.getInstance().getLaptopParser());
		provider.put(Refrigerator.class.getSimpleName(), ApplianceParserToXMLFactory.getInstance().getRefrigeratorParser());
		provider.put(Speakers.class.getSimpleName(), ApplianceParserToXMLFactory.getInstance().getSpeakersParser());
		provider.put(VacuumCleaner.class.getSimpleName(), ApplianceParserToXMLFactory.getInstance().getVacuumCleanerParser());
		
	}
	
	public ApplianceParserToXML getParser(Appliance appliance) {
		
		ApplianceParserToXML parser = provider.get(appliance.getClass().getSimpleName());
		return parser;
	}

}
