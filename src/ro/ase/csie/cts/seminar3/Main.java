package ro.ase.csie.cts.seminar3;

import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		
	    Persoana p = new Persoana("Diana");
		DebitBankAccount account = new DebitBankAccount("INGB123456789",p);
		account.deposit(100);
		try {
			account.withdraw(50);
			account.withdraw(70);
		} catch (InsuficientFundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		Map<Persoana, Receivable> employees = new HashMap<>();
		
		Persoana p1 = new Persoana("Chuck Norris");
		CreditBankAccount bankacc1 = new CreditBankAccount("BRD564656",p1,-500);
		Persoana p2 = new Persoana("Arnold");
		DebitBankAccount bankacc2 = new FeeBankAccount("BRD797971",p2);
		Persoana p3 = new Persoana("Van Damme");
		DebitBankAccount bankacc3 = new DebitBankAccount("ING123000",p3);
		
		employees.put(p1, bankacc1);
		employees.put(p2, bankacc2);
		employees.put(p3, bankacc3);
		
		for(Receivable b : employees.values()) {
			b.deposit(1000);
		}
		
		//deoarece interfata Receivable implementeaza doar functia deposit, nu mai putem
		//lua bani de la persoane si trebuie sa facem un nou Map cu conturi Payable
//		for(Receivable b : employees.values()) {
//			try {
//				b.withdraw(10);
//			} catch (InsuficientFundsException e) {
//				System.out.println(e.getMessage());
//			}
//		}
		
		//in acest map punem doar persoanele 2 si 3 deoarece acestea au conturi bancare de debit unde putem realiza operatia withdraw
		Map<Persoana,Payable> union = new HashMap<>();
		union.put(p2, bankacc2);
		union.put(p3, bankacc3);
		for(Payable b : union.values()) {
			try {
				b.withdraw(10);
			} catch (InsuficientFundsException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
