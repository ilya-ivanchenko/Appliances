package by.jwd.task.main;

import static by.jwd.task.entity.criteria.SearchCriteria.*;
import by.jwd.task.entity.Appliance;
import by.jwd.task.entity.criteria.Criteria;
import by.jwd.task.service.ApplianceService;
import by.jwd.task.service.ServiceFactory;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Appliance> appliance;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();

		//////////////////////////////////////////////////////////////////

		Criteria criteriaOven = new Criteria(Oven.class.getSimpleName());//"Oven"
		criteriaOven.add(Oven.CAPACITY.toString(), 33);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		criteriaOven = new Criteria(Oven.class.getSimpleName());
		criteriaOven.add(Oven.HEIGHT.toString(), 200);
		criteriaOven.add(Oven.DEPTH.toString(), 60);

		appliance = service.find(criteriaOven);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////
		
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 8000);

		appliance = service.find(criteriaTabletPC);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaLaptop = new Criteria(Laptop.class.getSimpleName());
		criteriaLaptop.add(Laptop.SYSTEM_MEMORY.toString(), 1000);
		criteriaLaptop.add(Laptop.OS.toString(), "windows");

		appliance = service.find(criteriaLaptop);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaRefrigerator = new Criteria(Refrigerator.class.getSimpleName());
		criteriaRefrigerator.add(Refrigerator.OVERALL_CAPACITY.toString(),300);
		criteriaRefrigerator.add(Refrigerator.HEIGHT.toString(),200);
		appliance = service.find(criteriaRefrigerator);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaSpeakers = new Criteria(Speakers.class.getSimpleName());
		criteriaSpeakers.add(Speakers.NUMBER_OF_SPEAKERS.toString(),2);
		appliance = service.find(criteriaSpeakers);

		PrintApplianceInfo.print(appliance);

		//////////////////////////////////////////////////////////////////

		Criteria criteriaVacuumCleaner = new Criteria(VacuumCleaner.class.getSimpleName());
		criteriaVacuumCleaner.add(VacuumCleaner.MOTOR_SPEED_REGULATION.toString(),2900);
		appliance = service.find(criteriaVacuumCleaner);

		PrintApplianceInfo.print(appliance);
	}

}
