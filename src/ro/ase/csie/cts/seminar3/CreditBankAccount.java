package ro.ase.csie.cts.seminar3;

public class CreditBankAccount extends ReceivableBankAccount{

	
	public CreditBankAccount(String iban, Persoana accountHolder,long balance,NotificationService notificationService) {
		super(iban,accountHolder,balance,notificationService);
	}
	
	//nu se vor putea scoate bani, se pot doar introduce bani de accea clasa CreditBankAccount va 
	//mosteni doar interfata Receivable
	
	//dp ce inlocuieste constructorul
	public static CreditBankAccount createCreditBankAccount(String iban, Persoana accountHolder,long balance,NotificationService notificationService) {
		return new CreditBankAccount(iban, accountHolder, balance, notificationService);
	}
	
	public static CreditBankAccount createCreditBankAccountNoBalance(String iban, Persoana accountHolder,NotificationService notificationService) {
		return new CreditBankAccount(iban, accountHolder,0, notificationService);
	}
	
	@Override
	public String toString() {
		return this.iban + ' ' + this.accountHolder.getName();
	}
	

}
