package by.jwd.task.dao;

import by.jwd.task.entity.Appliance;
import by.jwd.task.entity.criteria.Criteria;
import java.util.List;

public interface ApplianceDAO {
	List<Appliance> find(Criteria criteria);
}
