package com.test;

public class Employee {

	/*public class Employee {int id;
	int age;
	double salary;
	String name;
	}*/
	//use above the Employee class and sort the Employee objects in descending order based on name and salary.
	
	int id;
	int age;
	double salary;
	String name;
	public Employee(int id, int age, double salary, String name) {
		super();
		this.id = id;
		this.age = age;
		this.salary = salary;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", age=" + age + ", salary=" + salary + ", name=" + name + "]";
	}
	
	


}
