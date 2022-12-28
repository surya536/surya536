package di.annotation.example_6;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Employee {
	// Instance variables
	
	//---------Edit below
	//Assign value 20 using annotations
	private int employeeId;
	
	//Assign your name using annotations
	private String employeeName;
	
	//Assign the salary you get using annotations
	private double salary;
	
	@Autowired
	private Address address;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	// Parameterized Constructor 
	public Employee(int employeeId, String employeeName, double salary) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}
	
	// Getter and setter methods
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName="
				+ employeeName + ", salary=" + salary + "] \n";
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
