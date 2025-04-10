package payment;

public class Paypal extends Payment{
	public void processPayment(double amount){
		System.out.println("Processing $" + amount + " using Paypal...");
	}

	public void paymentAccess(String payment, double amount){
		if(payment.equals("Paypal")){
			//Paypal paypal= new Paypal();
			this.processPayment(amount);
		}
	}

}