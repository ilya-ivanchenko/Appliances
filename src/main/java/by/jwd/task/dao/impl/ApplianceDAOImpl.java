package by.jwd.task.dao.impl;

import static by.jwd.task.construction.ConstructorAppImpl.*;
import by.jwd.task.dao.ApplianceDAO;
import by.jwd.task.entity.*;
import by.jwd.task.entity.criteria.Criteria;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class ApplianceDAOImpl implements ApplianceDAO {

	private static BufferedReader reader;
	private static Map<String, Object> PropertiesFromDB = new HashMap<>();

	@Override
	public List<Appliance> find(Criteria criteria)   {
		String file = Objects.requireNonNull(getClass().getClassLoader().getResource("appliances_db.txt")).getPath();
		List<Appliance> appliances = new ArrayList<>();

		try {
			reader = new BufferedReader(new FileReader(file));
			String line;
			while (reader.ready()) {
				line = reader.readLine();
				PropertiesFromDB = makeMap(line,criteria);
					if (!PropertiesFromDB.isEmpty() && criteria.compareMaps(PropertiesFromDB)) {
						initAppliance(appliances,criteria, PropertiesFromDB);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return appliances;
	}

	public String obtainFirstWord(String line) {
		String word = "";
		if (!line.isEmpty()) {
			int i = line.indexOf(' ');
			word = line.substring(0, i);
		}
		return word;
	}


	private static final String ElEMENTS_TO_REPLACE = "(;|:|=|,|\\s)+";
	private static final String DELIMETER = " ";
	public Map<String,Object> makeMap(String line, Criteria criteria) {
		Map<String, Object> paramsValuesDB = new HashMap<>();
		if (criteria.compareGroupName(obtainFirstWord(line))) {
			String[] parameters = line.replaceAll(ElEMENTS_TO_REPLACE, DELIMETER).split(DELIMETER);
			for (int i = 1; i < parameters.length; i += 2) {
				paramsValuesDB.put(parameters[i], parameters[i + 1]);
			}
		}
		return paramsValuesDB;
	}

	private static final Map<String, Object> Appliance_maker = new HashMap<>();
	public List<Appliance> initAppliance(List<Appliance> appliances, Criteria criteria, Map<String,Object> map) {
		{
			Appliance_maker.put(Oven.class.getSimpleName(),getInstance().constructOven(map,criteria));
			Appliance_maker.put(TabletPC.class.getSimpleName(),getInstance().constructTabletPC(map,criteria));
			Appliance_maker.put(Laptop.class.getSimpleName(),getInstance().constructLaptop(map,criteria));
			Appliance_maker.put(Refrigerator.class.getSimpleName(),getInstance().constructRefrigerator(map,criteria));
			Appliance_maker.put(Speakers.class.getSimpleName(),getInstance().constructSpeakers(map,criteria));
			Appliance_maker.put(VacuumCleaner.class.getSimpleName(),getInstance().constructVacuumCleaner(map,criteria));
		}

			appliances.add((Appliance) Appliance_maker.get(criteria.getGroupSearchName()));
		return appliances;
	}
}