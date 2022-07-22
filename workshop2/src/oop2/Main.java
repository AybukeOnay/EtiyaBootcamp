package oop2;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Logger> loggers = new ArrayList<>();
		loggers.add(new DatabaseLogger());
		loggers.add(new ElasticLogger());
		loggers.add(new CloudLogger());

		
		EmployeeManager employeeManager=new EmployeeManager(loggers);
		employeeManager.add(new Employee(1, "Aybüke", "Onay", "0123456789",10000));

	}

}
