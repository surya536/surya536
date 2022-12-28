package A2_2;

public class Saving extends AccountImpl {
	
	public Saving(String accNo, double amt) {
		super(accNo, amt);
	}
	
	
	public void open() {
		System.out.println("Savings Account Opened!!!!");
	}
	public void close() {
		System.out.println("Savings Account Closed!!!!");
	}
	
	
	
}
