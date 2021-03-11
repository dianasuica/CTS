package ro.ase.csie.cts.seminar3;

public class FeeBankAccount extends DebitBankAccount  {
	
	private long fee = 2;

	public FeeBankAccount(String iban, Persoana persoana, NotificationService notificationService) {
		super(iban, persoana,notificationService);
		
	}
	
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		
		System.out.println("Adding " + fee + " fee to withdraw" );
		super.withdraw(amount+fee);
	}
	

}
