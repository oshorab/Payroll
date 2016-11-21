package payroll;

public class Employee {
	private String name;
	private int ID;
	private static int nextId = 0;

	public Employee(String name) {
		this.name = name;
		this.ID = nextId;
		nextId++;
	}

}
