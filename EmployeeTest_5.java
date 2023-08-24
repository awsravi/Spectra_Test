package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest_5 {
	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(new Employee(2, 27, 5000, "ravi"),
				(new Employee(1, 25, 10000, "kula")), (new Employee(4, 24, 50000, "upasana")),
				(new Employee(3, 30, 20000, "aruna")));

	//	System.out.println(employees);

		List<Employee> output = employees.stream().sorted((o1, o2) -> o2.getId() - o1.getId())
				.collect(Collectors.toList());
		System.out.println(output);

		List<Employee> output1 = employees.stream().sorted((o1, o2) -> o2.name.compareTo(o1.name))
				.collect(Collectors.toList());
		System.out.println(output);
		
		List<Employee> output2 = employees.stream().sorted()
				.collect(Collectors.toList());
		System.out.println(output);
		
		
		
		
		
	}
}
