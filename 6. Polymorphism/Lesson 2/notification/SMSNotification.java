package notification;

public class SMSNotification extends Notification{
	@Override
	public void send(){
		System.out.println("Sending SMS Notification...");
	}
}