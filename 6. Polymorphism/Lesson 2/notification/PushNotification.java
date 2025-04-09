package notification;

public class PushNotification extends Notification{
	@Override
	public void send(){
		System.out.println("Sending Push Notification...");
	}
}