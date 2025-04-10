package payment;

public class Paypal extends Payment{
	public void processPayment(double amount){
		System.out.println("\nProcessing $" + amount + " using Paypal...");
	}
}