package ro.ase.csie.cts.seminar3;

//aceasta interfata incalca regula Interface Segregation si vom
//sparge in 2 interfete Payable si Receivable a.i. CreditCardAccount sa implementeze doar Receivable pt a primi bani
//iar DebitBankAccount le va implementa pe amandou pentru acest tip de cont poate si sa retraga si sa primeasca bani
public interface Account {

	void withdraw(long amount) throws InsuficientFundsException;

	void deposit(long amount);

}