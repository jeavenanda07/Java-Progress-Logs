import payment.*;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

 		System.out.println("\nSelect Payment Type:");
		System.out.println("1. Paypal");
        	System.out.println("2. Bank Transfer");
        	System.out.println("3. Credit Card");
        	System.out.print("Enter your choice (1-3): ");

		int choice = scan.nextInt();
		Payment payment = null;
		
		switch(choice){
			case 1:
				payment = new Paypal();
				break;
			case 2:
				payment = new BankTransfer();
				break;
			case 3:
				payment = new CreditCard();
				break;
			default:
				System.out.println("Invalid choice");
				return;
		}

		payment.processPayment(100.0);
		payment.getPaymentDetails();
	}
}