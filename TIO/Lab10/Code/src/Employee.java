public class Employee {
	private String empId;
	private String name;
	private double basic;
	private double hra;
	private double perAllowances;
	private int role;
	
//	public Employee(String empId, String name, double basic, double hra,
//			double perAllowances, int role) {
//		this.empId = empId;
//		this.name = name;
//		this.basic = basic;
//		this.hra = hra;
//		this.perAllowances = perAllowances;
//		this.role = role;
//	}
	
//	public double getSalary() {
//		return SalaryCalculator.getSalary(this);
//	}
//	
//	public double getAllowance() {
//		return SalaryCalculator.getAllowance(this);
//	}
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasic() {
		return basic;
	}
	public void setBasic(double basic) {
		this.basic = basic;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getPerAllowances() {
		return perAllowances;
	}
	public void setPerAllowances(double perAllowances) {
		this.perAllowances = perAllowances;
	}
	public void setRole(int role) {
		this.role = role;
	}
	public int getRole() {
		return role;
	}
}




















