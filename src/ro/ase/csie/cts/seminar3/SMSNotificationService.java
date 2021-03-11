package ro.ase.csie.cts.seminar3;

public class SMSNotificationService implements NotificationService {

	@Override
	public void sendNotification(Persoana destinatar, String msg) {
		System.out.println("Sending SMS to " + destinatar.getPhone());
		
	}

}
