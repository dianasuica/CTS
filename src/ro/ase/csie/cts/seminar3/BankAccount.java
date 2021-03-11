package ro.ase.csie.cts.seminar3;

public class BankAccount {
	
	private String iban;
	private long balance;
	private Persoana accountHolder;
	
	public BankAccount(String iban, Persoana persoana) {
		this.iban = iban;
		this.accountHolder = persoana;
		this.balance = 0;
	}
	
	public void withdraw(long amount) throws InsuficientFundsException {
		if(amount > balance) {
			throw new InsuficientFundsException("Not enough money");
		}
		System.out.println("withdrawing " + amount + " from " + iban);
		balance -= amount;
	}
	
	public void deposit(long amount) {
		System.out.println("depositing " + amount + " in " + iban);
		balance += amount;
		
	}
	
	public String getIban() {
		return iban;
	}


	public long getBalance() {
		return balance;
	}


	public Persoana getAccountHolder() {
		return accountHolder;
	}


	
	
	
}
