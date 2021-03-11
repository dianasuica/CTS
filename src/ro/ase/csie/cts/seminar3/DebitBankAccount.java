package ro.ase.csie.cts.seminar3;

public class DebitBankAccount extends ReceivableBankAccount implements Payable {
	
	
	public DebitBankAccount(String iban,Persoana p) {
		super(iban,p,0);
	}
	
	//deoarece DebitBankAccount poate si sa primeasca si sa extraga bani, se implementeaza ambele interfete
	@Override
	public void withdraw(long amount) throws InsuficientFundsException {
		if(amount > balance) {
			throw new InsuficientFundsException("Not enough money");
		}
		System.out.println("withdrawing " + amount + " from " + iban);
		balance -= amount;
	}

}
