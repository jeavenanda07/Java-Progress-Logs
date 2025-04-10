package payment;

public class CreditCard extends Payment{

	public void processPayment(double amount){
		System.out.println("Processing $" + amount + " using Credit Card method...");
	}

	public void paymentAccess(String payment, double amount){
		if(payment.equals("Credit Card")){
			//CreditCard creditCard = new CreditCard();
			this.processPayment(amount);
		}
	}
}