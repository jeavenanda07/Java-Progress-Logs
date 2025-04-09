package notification;

public class EmailNotification extends Notification{
	@Override
	public void send(){
		System.out.println("Sending Email Notification...");
	}
}