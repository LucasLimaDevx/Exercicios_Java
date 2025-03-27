package entities;

public class Employee {
	private int id;
	private String name;
	private double salary;
	
	public Employee(int id, String name, double salary) {
		
		setId(id);
		setName(name);
		setSalary(salary);
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void increaseSalary(double percetage) {
		
		double newSalary = salary * (1.0 + percetage / 100.0);
		setSalary(newSalary);
		
	}
	
	public String toString() {
		return getId() + ", " + getName() + ", " + String.format("%.2f", getSalary());
	}
		
}
