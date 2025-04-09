import notification.*;

class Main{
	public static void main(String[] args){
		Notification[] notification = {
			new EmailNotification(),
			new PushNotification(),
			new SMSNotification(),
		};

		for(Notification notif: notification ){
			notif.send();
		}
	}
}