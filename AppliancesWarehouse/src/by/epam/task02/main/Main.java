package by.epam.task02.main;



import by.epam.task02.entity.TabletPC;
import by.epam.task02.entity.criteria.Criteria;
import by.epam.task02.entity.criteria.SearchCriteria.Oven;
import by.epam.task02.service.ApplianceService;
import by.epam.task02.service.ServiceFactory;

public class Main {


	public static void main(String[] args) {
		
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();
		PrintApplianceInfo print = new PrintApplianceInfo();
		
		Criteria criteria = new Criteria();
		criteria.setGroupSearchName("Laptop");
		print.printInfo(service.find(criteria));
		
		criteria.clearCriteria();
		
		criteria.addCriterion(Oven.CAPACITY.toString(), 33);
		print.printInfo(service.find(criteria));
		
		criteria.clearCriteria();
		
		TabletPC tapletPC = new TabletPC.Builder().batteryCapacity(1000).color("green")
				.displayInches(17).flashMemoryRom(16000).memoryRom(8000).build();
		service.add(tapletPC);
		



	}
}
