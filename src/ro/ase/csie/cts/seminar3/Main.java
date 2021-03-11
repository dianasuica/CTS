package ro.ase.csie.cts.seminar3;

import java.util.HashMap;
import java.util.Map;

import ro.ase.csie.cts.seminar2.solid.BankAccount;
import ro.ase.csie.cts.seminar2.solid.FeeBankAccount;
import ro.ase.csie.cts.seminar2.solid.InsuficientFundsException;
import ro.ase.csie.cts.seminar2.solid.Persoana;

public class Main {

	public static void main(String[] args) {
		
		Persoana p = new Persoana("Diana");
		BankAccount account = new BankAccount("INGB123456789",p);
		account.deposit(100);
		try {
			account.withdraw(50);
			account.withdraw(70);
		} catch (InsuficientFundsException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
		Map<Persoana, BankAccount> employees = new HashMap<>();
		
		Persoana p1 = new Persoana("Chuck Norris");
		BankAccount bankacc1 = new BankAccount("BRD564656",p1);
		Persoana p2 = new Persoana("Arnold");
		BankAccount bankacc2 = new FeeBankAccount("BRD797971",p2);
		Persoana p3 = new Persoana("Van Damme");
		BankAccount bankacc3 = new BankAccount("ING123000",p3);
		
		employees.put(p1, bankacc1);
		employees.put(p2, bankacc2);
		employees.put(p3, bankacc3);
		
		for(BankAccount b : employees.values()) {
			b.deposit(1000);
		}
		
		for(BankAccount b : employees.values()) {
			try {
				b.withdraw(10);
			} catch (InsuficientFundsException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}

	}

}
