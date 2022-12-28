package A2_2;

public class OverDraft extends AccountImpl {
	
	public OverDraft(String accNo, double amt) {
		super(accNo, amt);
		// TODO Auto-generated constructor stub
	}

	private double overDraftLimit;
	
	public void withdraw(double amount) {
		double bal = super.getBalance() - amount;
		super.setBalance(bal);
	}
	
	public double getOverDraftLimit() {
		return overDraftLimit;
	}
	
	public void setOverDraftLimit(double limit) {
		this.overDraftLimit = limit;
	}
	
	public void open() {
		System.out.println("Overdraft Account Opened!!!!");
	}
	public void close() {
		System.out.println("Overdraft Account Closed!!!!");
	}
	
	
	
}