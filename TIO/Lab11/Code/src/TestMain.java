public class TestMain {
	public static void main(String[] args) {
		Employee emp1 = new Employee("1001","Sanjay",15000.0,12500.0,30.0,Roles.DEVELOPER);
		
		Employee emp2 = new Employee("1231","Varidh",25000.0,12500.0,35.0,Roles.SR_DEVELOPER);
		
		Employee emp3 = new Employee("1661","Tina",12000.0,10500.0,30.0,Roles.TEST_ENGINEER);
		
		Employee emp4 = new Employee("2001","Vishal",45000.0,15500.0,40.0,Roles.DESIGNER);
		
		Employee empArr[] = new Employee[5];
		empArr[0] = emp1;
		empArr[1] = emp2;
		empArr[2] = emp3;
		empArr[3] = emp4;
		
//		Employee emp5 = new Employee();
//		
//		System.out.println("Enter emp id : ");
//		String empId = Console.readLine();
//		
//		System.out.println("Name : ");
//		String name = Console.readLine();
//		
//		System.out.println("Basic : ");
//		double basic = Console.readDouble();
//		
//		System.out.println("HRA : ");
//		double hra = Console.readDouble();
//		
//		System.out.println("Percentage of Allowance : ");
//		double perAllowances = Console.readDouble();
//		
//		System.out.println("Enter the Role (1.DEVELOPER 2.TEST_ENGINEER 3.SR_DEVELOPER 4.DESIGNER) :");
//		int role = Console.readInt();
//		
//		emp5.setEmpId(empId);
//		emp5.setName(name);
//		emp5.setBasic(basic);
//		emp5.setHra(hra);
//		emp5.setPerAllowances(perAllowances);
//		emp5.setRole(role);
//		
//		empArr[4] = emp5;
		
		System.out.println("Enter the Date Of Report :" );
		String dtReport = Console.readLine();
		
//		EmployeeReport report = new EmployeeReport(dtReport);
		report.display(empArr);
	}		
}

















