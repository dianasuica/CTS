package ro.ase.csie.cts.seminar4;

import java.math.BigInteger;
import java.util.Random;

import ro.ase.csie.cts.seminar2.solid.BankAccount;
import ro.ase.csie.cts.seminar3.DebitBankAccount;
import ro.ase.csie.cts.seminar3.EmailNotificationService;
import ro.ase.csie.cts.seminar3.InsuficientFundsException;
import ro.ase.csie.cts.seminar3.NotificationService;
import ro.ase.csie.cts.seminar3.Persoana;
import ro.ase.csie.cts.seminar3.Persoana.NotificationType;
import ro.ase.csie.cts.seminar4.banking.Banca;
import ro.ase.csie.cts.seminar4.singleton.Elvis;
import ro.ase.csie.cts.seminar4.singleton.ElvisVersiunea2;
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
		
		//DESIGN PATTERN SINGLETON
		//situatie1
		//Elvis elvis = Elvis.theTrueElvis;
		
		//situatie2
		Elvis elvis = Elvis.getInstance();
		Elvis elvis2 = Elvis.getInstance();
		System.out.println("\n----SINGLETON ELVIS----");
		elvis.sing();
		System.out.println(elvis == elvis2);
		
		//PRIN ENUM
		ElvisVersiunea2 elvisVersiunea2 = ElvisVersiunea2.INSTANCE;
		elvisVersiunea2.sing();
	
		//DESIGN PATTERN FACTORY
		System.out.println("\n----FACTORY BANCA----");
		Banca banca = Banca.getInstance();
		
		Persoana adult = new Persoana("Adult");
		adult.setVarsta(30);
		adult.setEmail("adult@yahoo.com");
		adult.setPhone("079999");
		adult.setNotificationType(NotificationType.EMAIL);
        
		
		Persoana copil = new Persoana("Copil");
		copil.setVarsta(12);
		copil.setEmail("copil@yahoo.com");
		copil.setPhone("074969");
		copil.setNotificationType(NotificationType.SMS);
		DebitBankAccount debit1 = banca.openDebitAccount(adult);
		DebitBankAccount debit2 = banca.openDebitAccount(copil);
		
		
		debit1.deposit(20);
		debit2.deposit(5);
		try {
			debit1.withdraw(15);
			debit2.withdraw(3);
		} catch (InsuficientFundsException e) {
			// TODO Auto-generated catch block
			System.err.println(e.getMessage());
		}
	}

}
