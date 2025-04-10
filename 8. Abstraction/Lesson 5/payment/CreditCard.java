package payment;

public class CreditCard extends Payment{

	public void processPayment(double amount){
		System.out.println("\nProcessing $" + amount + " using Credit Card method...");
	}
}