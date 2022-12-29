public class SalaryCalculator {
	public static double getSalary(Employee emp) {
		double salary = 0;
		
		salary = emp.getBasic() + emp.getHra() + getAllowance(emp);
		
		return salary;
	}
	public static double getAllowance(Employee emp) {
		double allowance = (emp.getBasic() * emp.getPerAllowances() / 100.0);
		return allowance;
	}
}
