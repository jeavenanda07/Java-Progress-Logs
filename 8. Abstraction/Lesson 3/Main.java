import payment.*;

class Main{
	public static void main(String[] args){
		Payment[] payment = {
			new Paypal(),
			new BankTransfer(),
			new CreditCard()
		};

		for(Payment displayPayment : payment){
			displayPayment.processPayment(100);
			displayPayment.getPaymentDetails();
		}
	}
}