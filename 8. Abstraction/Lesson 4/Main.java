import payment.*;
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		Payment[] payment = {
			new Paypal(),
			new BankTransfer(),
			new CreditCard()
		};

		for(Payment displayPayment : payment){
			displayPayment.paymentAccess(paymentType, 100);
		}
	}
}