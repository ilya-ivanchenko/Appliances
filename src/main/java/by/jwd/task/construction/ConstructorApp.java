package by.jwd.task.construction;

import by.jwd.task.entity.Appliance;
import by.jwd.task.entity.criteria.Criteria;
import java.util.Map;

public interface ConstructorApp {
  Appliance constructOven(Map<String,Object> map, Criteria criteria);
  Appliance constructTabletPC(Map<String,Object> map, Criteria criteria);
  Appliance constructLaptop(Map<String,Object> map, Criteria criteria);
  Appliance constructRefrigerator(Map<String, Object> map, Criteria criteria);
  Appliance constructSpeakers(Map<String, Object> map, Criteria criteria);
  Appliance constructVacuumCleaner(Map<String, Object> map, Criteria criteria);
}
