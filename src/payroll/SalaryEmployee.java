package payroll;

public class SalaryEmployee extends Employee {
	private double annualSalary;
	
	public SalaryEmployee(String name, double salary) {
		super(name);
		annualSalary = salary;
	}
	
	
}
