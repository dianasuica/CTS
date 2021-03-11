package ro.ase.csie.cts.seminar3;

public class EmailNotificationService implements NotificationService{

	
	@Override
	public void sendNotification(Persoana destinatar, String msg) {
		System.out.println("Sending email to " + destinatar.getEmail());
		
	}

}
