package ro.ase.csie.cts.seminar3;

public class CreditBankAccount extends ReceivableBankAccount{

	
	public CreditBankAccount(String iban, Persoana accountHolder,long balance,NotificationService notificationService) {
		super(iban,accountHolder,balance,notificationService);
	}
	
	//nu se vor putea scoate bani, se pot doar introduce bani de accea clasa CreditBankAccount va 
	//mosteni doar interfata Receivable
	
	

}
