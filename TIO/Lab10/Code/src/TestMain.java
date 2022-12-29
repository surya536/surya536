public class TestMain {
	public static void main(String[] args) {
//		Employee emp1 = new Employee("1001","Sanjay",15000.0,12500.0,30.0,Roles.DEVELOPER);
//		
//		Employee emp2 = new Employee("1231","Varidh",25000.0,12500.0,35.0,Roles.SR_DEVELOPER);
//		
//		Employee emp3 = new Employee("1661","Tina",12000.0,10500.0,30.0,Roles.TEST_ENGINEER);
//		
//		Employee emp4 = new Employee("2001","Vishal",45000.0,15500.0,40.0,Roles.DESIGNER);
		
		Employee empArr[] = new Employee[4];
		empArr[0] = emp1;
		empArr[1] = emp2;
		empArr[2] = emp3;
		empArr[3] = emp4;
		
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
		EmployeeReport report = new EmployeeReport();
		report.setDtReport(dtReport);
		report.display(empArr);
	}		
}


















