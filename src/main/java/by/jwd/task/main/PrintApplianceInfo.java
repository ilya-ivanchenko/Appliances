package by.jwd.task.main;

import by.jwd.task.entity.Appliance;
import java.util.List;

public class PrintApplianceInfo {
	private static String available = "\nAvailable - ";
	private static String notAvailable = "\nХ  Appliance is not available Х";

	public static void print(List<Appliance> appliance) {
		if (!appliance.isEmpty()) {
			for (Appliance elem : appliance) {
				System.out.println(available + elem.toString());
			}
		}
		 else {
			System.out.println(notAvailable);
		}
	}
}
