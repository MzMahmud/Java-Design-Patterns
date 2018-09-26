import java.util.ArrayList;

public class Employee {
	private String name;
	private String dept;
	private int salary;
	
	private ArrayList<Employee> subordinates;
	
	public Employee(String n,String d,int s) {
		name = n;
		dept = d;
		salary = s;
		
		subordinates = new ArrayList<>();
	}
	
	public void add(Employee e) {
		subordinates.add(e);
	}
	
	public void remove(Employee e) {
		subordinates.remove(e);
	}
	
	public ArrayList<Employee> getSubordinates() {
		return subordinates;
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + ":: Dept: " + dept + ":: Salary: " + salary + "]";
	}
}
