package oop2;

import java.util.List;

public class EmployeeManager {

	private List<Logger> loggers;

	public EmployeeManager(List<Logger> loggers) {
		this.loggers = loggers;
	}
	
	public void add(Employee employee) {
		for (Logger logger : loggers) {
			logger.log(employee.getFirstName() + " " + employee.getLastName() + " " + employee.getNationalIdentity());
		}
	}
	
}
