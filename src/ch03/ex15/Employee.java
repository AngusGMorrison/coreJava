package ch03.ex15;

import java.util.Arrays;
import java.util.Comparator;

public class Employee {
	private String name;
	private int salary;
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
		
	
	public String getName() {
		return name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public static void sort(Employee[] employees) {
		Arrays.sort(employees, Comparator
			.comparing(Employee::getSalary)
			.thenComparing(Employee::getName));
	}
	
	public static void sortReversed(Employee[] employees) {
		Arrays.sort(employees, Comparator
			.comparing(Employee::getSalary)
			.thenComparing(Employee::getName)
			.reversed());
	}
	
	public static void print(Employee[] employees) {
		for (Employee employee : employees) {
			System.out.println(employee.name + " " + employee.salary);
		}
	}
}
