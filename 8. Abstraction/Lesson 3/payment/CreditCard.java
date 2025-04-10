package payment;

public class CreditCard extends Payment{
	public void processPayment(double amount){
		System.out.println("Processing $" + amount + " using Credit Card method...");
	}
}