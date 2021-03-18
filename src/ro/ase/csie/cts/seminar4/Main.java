package ro.ase.csie.cts.seminar4;

import java.math.BigInteger;
import java.util.Random;

import ro.ase.csie.cts.seminar2.solid.BankAccount;
import ro.ase.csie.cts.seminar3.DebitBankAccount;
import ro.ase.csie.cts.seminar3.EmailNotificationService;
import ro.ase.csie.cts.seminar3.NotificationService;
import ro.ase.csie.cts.seminar3.Persoana;
import ro.ase.csie.cts.seminar3.CreditBankAccount;

public class Main {

	public static void main(String[] args) {
		NotificationService emailService = new EmailNotificationService();
		
		Persoana p3 = new Persoana("Van Damme");
		p3.setEmail("vandamme@yahoo.com");
		p3.setPhone("079999");
		DebitBankAccount bankacc3 = new DebitBankAccount("ING123000",p3,emailService);
		
		CreditBankAccount b = CreditBankAccount.createCreditBankAccount("ING432", p3, 0, emailService);
		CreditBankAccount b2 = CreditBankAccount.createCreditBankAccountNoBalance("BRD678", p3, emailService);

		BigInteger bi = new BigInteger(24,11, new Random());   //CONSTRUCTOR CARE GENEREAZA UN BIG INTER PROBABIL PRIM
		BigInteger bi2 = BigInteger.probablePrime(12, new Random());  //RETURNEAZA UN BIG INTER CARE PROBABIL E PRIM
		
		Boolean value = Boolean.valueOf(false);  //metoda statica care returneaza un obiect boolean existent static in clasa, nu creaza un obiect nou, ci are deja 2 statice TRUE si FALSE si o returneaza pe cea corespunzatoare
		
		
		b.deposit(500);
		System.out.println(b.toString());
		System.out.println(b2.toString());
		
		

	}

}
