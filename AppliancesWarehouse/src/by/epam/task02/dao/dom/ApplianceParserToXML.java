package by.epam.task02.dao.dom;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import by.epam.task02.entity.Appliance;

public abstract class ApplianceParserToXML {
	
	public abstract Element parseToXML(Appliance appliance, Document document);

}
