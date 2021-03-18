package ro.ase.csie.cts.seminar4.banking;

import java.time.LocalDate;
import java.util.Date;

import ro.ase.csie.cts.seminar3.DebitBankAccount;
import ro.ase.csie.cts.seminar3.EmailNotificationService;
import ro.ase.csie.cts.seminar3.FeeBankAccount;
import ro.ase.csie.cts.seminar3.NotificationService;
import ro.ase.csie.cts.seminar3.Persoana;
import ro.ase.csie.cts.seminar3.SMSNotificationService;
import ro.ase.csie.cts.seminar3.Persoana.NotificationType;

//FACTORY & SINGLETON
public class Banca {
	
	private static Banca INSTANCE;
	
	private NotificationService emailnotificationService;
	private NotificationService smsnotificationService;
	
	private Banca() {
		emailnotificationService = new EmailNotificationService();
		smsnotificationService = new SMSNotificationService();
	}
	
	public static synchronized Banca getInstance() {
		if(INSTANCE == null) {
			INSTANCE = new Banca();
		}
		
		return INSTANCE;
	}
	
	public DebitBankAccount openDebitAccount(Persoana holder) {
		
		DebitBankAccount bankAccount;
		NotificationType notificationType;
	   
	    if(holder.getVarsta() >= 18 ) {
	    	bankAccount = new FeeBankAccount(generateIban(), holder, 
	    			              holder.getNotificationType().getNotificationService());
	    }else {
	    	bankAccount = new DebitBankAccount(generateIban(), holder,  
	    			              holder.getNotificationType().getNotificationService()); 
	    }
		
		return bankAccount;
	}
	
	private String generateIban() {
		return "INGB" + System.currentTimeMillis();
	}
	

}
