package ch03.ex01;

import java.util.Random;

public class Runner {
	public static void main(String[] args) {
		Employee[] employees = new Employee[3];
		Random generator = new Random();
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("Name", generator.nextInt(3000));
			System.out.println(employees[i].getSalary());
		}
		
		double average = Measurable.average(employees);
		System.out.println(average);
		
		String bestPaidEmployeeName = Employee.getBestPaidEmployeeName(employees);
		System.out.println(bestPaidEmployeeName);
	}
}
