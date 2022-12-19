package com.app.bytebrains.project;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeManagementProject {

	public static void main(String[] args) {

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(111, "Faishal khan", 32, "Male", "HR", 2011, 25000.0));
		employeeList.add(new Employee(122, "Naveen Kumar", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		employeeList.add(new Employee(133, "Tanuraj Panwar", 29, "Male", "Infrastructure", 2012, 18000.0));
		employeeList.add(new Employee(144, "Danish Chandargi", 28, "Male", "Product Development", 2014, 32500.0));
		employeeList.add(new Employee(155, "Ankita Jagtap", 27, "Female", "HR", 2013, 22700.0));
		employeeList.add(new Employee(166, "Srinivas Kumar", 43, "Male", "Security And Transport", 2016, 10500.0));
		employeeList.add(new Employee(177, "Rutik Shevle", 35, "Male", "Account And Finance", 2010, 27000.0));
		employeeList.add(new Employee(188, "Lavina Tangralu", 31, "Female", "Product Development", 2015, 34500.0));
		employeeList.add(new Employee(199, "Shubham	Kumbhar", 24, "Male", "Sales And Marketing", 2016, 11500.0));
		employeeList.add(new Employee(200, "Omkar Shinde", 38, "Male", "Security And Transport", 2015, 11000.5));
		employeeList.add(new Employee(211, "Kamasani Poorna", 27, "Female", "Infrastructure", 2014, 15700.0));
		employeeList.add(new Employee(222, "Suresh Babu", 25, "Male", "Product Development", 2016, 28200.0));
		employeeList.add(new Employee(233, "Shyam Shete", 27, "Female", "Account And Finance", 2013, 21300.0));
		employeeList.add(new Employee(244, "Harshal Attarde", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		employeeList.add(new Employee(255, "Shradha Jagdale", 23, "Female", "Infrastructure", 2018, 12700.0));
		employeeList.add(new Employee(266, "Priti Pipada", 26, "Female", "Product Development", 2015, 28900.0));
		employeeList.add(new Employee(277, "Ajay Kumar", 31, "Male", "Product Development", 2012, 35700.0));

		// Male and Female count:
		// Male = 5
		// Female = 6

		Map<String, Long> countMaleandFemale = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
		System.out.println(countMaleandFemale);

		// Get all department
		Stream<String> distinct = employeeList.stream().map(Employee::getDepartment);
		Set<String> collect = distinct.collect(Collectors.toSet());
		System.out.println(collect);

		// Highest paid employee
		Employee collect2 = employeeList.stream()
				.collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))).get();
		System.out.println(collect2);

		List<Employee> collect1 = employeeList.stream().filter(e -> e.getSalary() > 28900.0)
				.collect(Collectors.toList());

		System.out.println(collect);
		for (Employee emp : collect1) {
			System.out.println(emp.getName() + " " + emp.getDepartment());
		}

		//

		Employee findFirst = employeeList.stream().sorted(Comparator.comparingInt(Employee::getYearOfJoining))
				.findFirst().get();
		System.out.println(findFirst);

		Map<String, Double> collect3 = employeeList.stream()
				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
		System.out.println(collect);

		Employee emp = employeeList.stream().max(Comparator.comparingInt(Employee::getAge)).get();
		System.out.println(emp.getName() + " " + emp.getAge() + " " + emp.getDepartment());

	}

}
