package payment;

public class Paypal extends Payment{
	
	public void processPayment(double amount){
		System.out.println("Processing $" + amount + " using Paypal...");
	}
}