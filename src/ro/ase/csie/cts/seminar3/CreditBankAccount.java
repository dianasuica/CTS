package ro.ase.csie.cts.seminar3;

public class CreditBankAccount extends ReceivableBankAccount{

	
	public CreditBankAccount(String iban, Persoana accountHolder,long balance) {
		super(iban,accountHolder,balance);
	}
	
	//nu se vor putea scoate bani, se pot doar introduce bani de accea clasa CreditBankAccount va 
	//mosteni doar interfata Receivable
	
	

}
