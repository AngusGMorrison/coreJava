package ch03.ex15;

public class EmployeeSorter {

	public static void main(String[] args) {
		Employee employee1 = new Employee("Angus", 35000);
		Employee employee4 = new Employee("Aaron", 35000);
		Employee employee3 = new Employee("Colin", 100000);
		Employee employee2 = new Employee("Bianca", 90000);
		Employee[] employees = { employee1, employee4, employee3, employee2 };
		
		Employee.sort(employees);
		Employee.print(employees);
		
		Employee.sortReversed(employees);
		Employee.print(employees);
	}

}
