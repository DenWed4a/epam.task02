package by.epam.task02.dao.dom.impl;

import java.util.ArrayList;
import java.util.List;

import by.epam.task02.dao.dom.ApplianceParser;
import by.epam.task02.dao.dom.ApplianceParserFactory;

public class ApplianceParserList {
	private List<ApplianceParser> parserList = new ArrayList<ApplianceParser>();
	
	public ApplianceParserList() {
		parserList.add(ApplianceParserFactory.getInstance().getLaptopParser());
		parserList.add(ApplianceParserFactory.getInstance().getTabletPCParser());
		parserList.add(ApplianceParserFactory.getInstance().getOvenParser());
		parserList.add(ApplianceParserFactory.getInstance().getRefrigeratorParser());
		parserList.add(ApplianceParserFactory.getInstance().getSpeakersParser());
		parserList.add(ApplianceParserFactory.getInstance().getVacuumCleanerParser());
	}

	public List<ApplianceParser> getParserList() {
		return parserList;
	}
	


}
