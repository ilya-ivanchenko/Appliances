package by.jwd.task.service;

import by.jwd.task.entity.Appliance;
import by.jwd.task.entity.criteria.Criteria;
import java.util.List;

public interface ApplianceService {	
	
	List<Appliance> find(Criteria criteria);
}
