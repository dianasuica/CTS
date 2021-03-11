package ro.ase.csie.cts.seminar3;

import java.util.HashMap;
import java.util.Map;


public class Main {

	public static void main(String[] args) {
		
//	    Persoana p = new Persoana("Diana");
//		DebitBankAccount account = new DebitBankAccount("INGB123456789",p);
//		account.deposit(100);
//		try {
//			account.withdraw(50);
//			account.withdraw(70);
//		} catch (InsuficientFundsException e) {
//			// TODO Auto-generated catch block
//			System.out.println(e.getMessage());
//		}
		
		NotificationService smsService = new SMSNotificationService();
		NotificationService emailService = new EmailNotificationService();
		
		Map<Persoana, Receivable> employees = new HashMap<>();
		
		Persoana p1 = new Persoana("Chuck Norris");
		p1.setEmail("noris@yahoo.com");
		p1.setPhone("0745656");
		CreditBankAccount bankacc1 = new CreditBankAccount("BRD564656",p1,-500,smsService);
		Persoana p2 = new Persoana("Arnold");
		p2.setEmail("arnold@yahoo.com");
		p2.setPhone("071233");
		DebitBankAccount bankacc2 = new FeeBankAccount("BRD797971",p2,emailService);
		Persoana p3 = new Persoana("Van Damme");
		p3.setEmail("vandamme@yahoo.com");
		p3.setPhone("079999");
		DebitBankAccount bankacc3 = new DebitBankAccount("ING123000",p3,emailService);
		
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
		
		System.out.println("\n\n");
		
		bankacc2.transfer(bankacc1, 50);

	}

}
