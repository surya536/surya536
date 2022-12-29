public class AccManager {
	public void fillAccountData(Account a1) {
		// This code is for trainer's reference
		//*******************************************
		
		// Do not share the commented code with the trainees
		//***************************************************
		
//		String accNo;
//		String name;
//		double balance;
//		
//		System.out.println("Enter AccNo : ");
//		accNo = Console.readLine();
//		
//		System.out.println("Enter Name : ");
//		name = Console.readLine();
//		
//		System.out.println("Enter Balance : ");
//		balance = Console.readDouble();
//		
//		a1.setAccNo(accNo);
//		a1.setName(name);
//		a1.setBalance(balance);
	}
	public void displayAccountData(Account a1) {
		System.out.println("AccNo : " + a1.getAccNo());
		System.out.println("Name : " + a1.getName());
		System.out.println("Balance : " + a1.getBalance());
	}
}
