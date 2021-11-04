package by.epam.task02.dao.dom.impl;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import by.epam.task02.dao.dom.ApplianceParser;

public class XMLReader {
	
  private List<ApplianceParser> parsers = new ApplianceParserList().getParserList();
  private DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
  private final String puthXML = "resources/Appliances.xml";

	
  
	public void readDocument() throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilder docBuilder = factory.newDocumentBuilder();
		Document document = docBuilder.parse(puthXML);
		
		for(ApplianceParser element : parsers) {
			element.parse(document);
		}
	}
	
}
