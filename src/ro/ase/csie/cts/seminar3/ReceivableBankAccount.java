package ro.ase.csie.cts.seminar3;

public class ReceivableBankAccount implements Receivable {

	protected long balance;
	protected String iban;
	protected Persoana accountHolder;
	protected NotificationService notificationService;
	
	public ReceivableBankAccount(NotificationService notificationService) {
		this.notificationService = notificationService;
	}
	
	public ReceivableBankAccount(String iban,Persoana accountHolder, long balance, NotificationService notificationService) {
		this.iban = iban;
		this.accountHolder = accountHolder;
		this.balance = balance;
		this.notificationService = notificationService;
	}
	
	@Override
	public void deposit(long amount) {
		notificationService.sendNotification(accountHolder, "Adding " + amount + " to " + this.iban);
		  this.balance += amount;
	}
	
	public void setIban(String iban) {
		this.iban = iban;
	}
	
	public void setAccountHolder(Persoana accountHolder) {
		this.accountHolder = accountHolder;
	}
	
	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	public Persoana getAccountHolder() {
		return accountHolder;
	}
	
	public String getIban() {
		return iban;
	}
	
	public long getBalance() {
		return balance;
	}
	
	
	

}
