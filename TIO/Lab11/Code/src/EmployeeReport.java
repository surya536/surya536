public class EmployeeReport {
	private String dtReport;
	
	public EmployeeReport(String dtReport) {
		this.dtReport = dtReport;
	}
	private void printLine() {
		System.out.println("---------------------------------------------------------------------------");
	}
	private void displayHeader() {
		printLine();
		System.out.print("EMPLOYEE REPORT\t\t\t\t");
		System.out.println("Date : " + dtReport);
		printLine();
	}
	private void displayFooter(int count) {
		printLine();
		System.out.println("Total Employees : " + count);
		printLine();
	}
	public void display(Employee empArr[]) {
		displayHeader();
		
		System.out.println("EMP_ID\tNAME\tROLE\t\tBASIC\tHRA\tALLOW\tSALARY");
		printLine();
		for(int i=0;i<empArr.length;++i) {
			Employee emp = empArr[i];
//			String roleDesc = emp.getRoleDescription();
			double allowances = emp.getAllowance();
			double salary = emp.getSalary();
			
			System.out.println(emp.getEmpId() + "\t" + emp.getName() + "\t" + roleDesc + "\t" + emp.getBasic() + "\t" + 
					emp.getHra() + "\t" + allowances + "\t" + salary);
		}
		
		displayFooter(empArr.length);
	}
	public void setDtReport(String dtReport) {
		this.dtReport = dtReport;
	}
	public String getDtReport() {
		return dtReport;
	}
}