package by.jwd.task.service.impl;

import by.jwd.task.dao.ApplianceDAO;
import by.jwd.task.dao.DAOFactory;
import by.jwd.task.entity.Appliance;
import by.jwd.task.entity.criteria.Criteria;
import by.jwd.task.service.ApplianceService;
import by.jwd.task.service.validation.Validator;
import java.util.Collections;
import java.util.List;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List<Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return Collections.emptyList();
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		List<Appliance> appliance = applianceDAO.find(criteria);
		
		return appliance;
	}
}