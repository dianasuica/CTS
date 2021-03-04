package ro.ase.csie.cts.seminar2;

import ro.ase.csie.cts.seminar2.solid.BankAccount;
import ro.ase.csie.cts.seminar2.solid.Persoana;

public class Main {

	public static void main(String[] args) {
		
		
//        CalendarUtil cu = new CalendarUtil();
//        
//       
//		
//		try {
//			System.out.println(cu.weekdDay(4));
//			System.out.println(cu.weekDay2(3));
//			System.out.println(cu.weekDay3(3));
//			System.out.println(cu.weekDay4(7));
//		} catch (IncorectDayException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		Persoana p = new Persoana("Diana");
		BankAccount account = new BankAccount("INGB123456789",p);
		account.deposit(100);
		account.withdraw(50);
		account.withdraw(70);
		System.out.println(account.getBalance());


	}

}
