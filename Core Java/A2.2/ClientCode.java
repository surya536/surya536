package A2_2;

public class ClientCode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account account1 =  AccountFactory.create("SB1001", 1000, "SAV");
		account1.open();
		System.out.println(account1);
		account1.deposit(4000);
		System.out.println(account1);
		account1.withdraw(2000);
		System.out.println(account1);
		
		System.out.println();
		System.out.println();
		
		Account account2 = AccountFactory.create("OD1001", 10000, "OD");
		account2.open();
		System.out.println(account2);
		account2.withdraw(4000);
		System.out.println(account2);
		account2.withdraw(7000);
		System.out.println(account2);
		account2.deposit(1000);
		System.out.println(account2);
		
	}

}
