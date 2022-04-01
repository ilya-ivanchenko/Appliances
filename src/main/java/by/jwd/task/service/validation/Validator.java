package by.jwd.task.service.validation;

import by.jwd.task.entity.criteria.Criteria;

public class Validator {

	public static boolean criteriaValidator(Criteria criteria) {

		return criteria.compareWithCriteriaInEnumClasses() ;
	}
}