package ro.ase.csie.cts.seminar3;

public class DebitBankAccount extends ReceivableBankAccount implements Payable,Transferable {
	
	
	public DebitBankAccount(String iban,Persoana p,NotificationService notificationService) {
		super(iban,p,0,notificationService);
	}
	
	//deoarece DebitBankAccount poate si sa primeasca si sa extraga bani, se implementeaza ambele interfete
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		if(amount > balance) {
			throw new InsuficientFundsException("Not enough money");
		}
		this.notificationService.sendNotification(accountHolder, "withdrawing " + amount + " from " + this.iban);
		balance -= amount;
	}

	@Override
	public void transfer(Receivable destination, long amount) {
		try {
			this.withdraw(amount);
			System.out.println("Transfering money");
		} catch (InsuficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		destination.deposit(amount);
	}

}
