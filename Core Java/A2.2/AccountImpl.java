package A2_2;

public abstract class AccountImpl implements Account {

	private String accountNo;
	private double balance;
	
	public AccountImpl(String accNo, double amt){
		this.accountNo = accNo;
		this.balance = amt;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double amt) {
		this.balance = amt;
	}
	
	public void withdraw(double amt) {
		this.balance = this.balance - amt;
	}
	
	public void deposit(double amt) {
		this.balance = this.balance + amt;
	}
	
	@Override
	public String toString() {
		return "AccountImpl [accountNo=" + accountNo + ", balance=" + balance + "]";
	}
	
	

}
