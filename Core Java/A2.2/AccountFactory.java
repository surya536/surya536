package A2_2;

public class AccountFactory{
	

	static Account create(String accNo, double bal, String accType) {
		Account acc ;
		if(accType == "SAV") {
			acc = new Saving(accNo, bal);
			return acc;
		}
		else if(accType == "OD") {
			acc = new OverDraft(accNo, bal);
			return acc;
		}
		else {
			return null;
		}
		
	}


}
