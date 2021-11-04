package by.epam.task02.dao.dom.impl;

import java.io.FileWriter;
import java.io.IOException;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import by.epam.task02.dao.TemporaryStorage;
import by.epam.task02.dao.dom.ApplianceParserProvider;
import by.epam.task02.dao.dom.ApplianceParserToXML;
import by.epam.task02.entity.Appliance;

public class XMLWriter {
	
	private final String puthXML = "resources/Appliances.xml";
	private TemporaryStorage storage = TemporaryStorage.getInstance();
	private ApplianceParserProvider parserProvider = new ApplianceParserProvider();

	
	
	
	
	public void write(Appliance appliance) throws ParserConfigurationException, IOException, TransformerException {
		
		storage.getApplianceStorage().add(appliance);
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);	
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.newDocument();
		
		Element appliances = document.createElement("n:appliances");
		appliances.setAttribute("xmlns:n", "http://www.epam.by/appliance");
		appliances.setAttribute("xmlns:xsi", "http://www.w3.org/2001/XMLSchema-instance");
		appliances.setAttribute("xsi:schemaLocation", "http://www.epam.by/appliance schema.xsd");
		Element applianceElement = document.createElement("appliance");
		
		
		for(int i = 0; i < storage.getApplianceStorage().size(); i++) {
			
			ApplianceParserToXML parser = parserProvider.getParser(storage.getApplianceStorage().get(i));
			Element element = parser.parseToXML(storage.getApplianceStorage().get(i), document);
			applianceElement.appendChild(element);
		}
		
		
		
		appliances.appendChild(applianceElement);
		document.appendChild(appliances);
		
		TransformerFactory trans = TransformerFactory.newInstance();
		
		Transformer transformer = trans.newTransformer();	
		transformer.setOutputProperty(OutputKeys.INDENT, "yes");
		DOMSource source =  new DOMSource(document);
		StreamResult result = new StreamResult(new FileWriter(puthXML));
		transformer.transform(source, result);
		
	}

}
