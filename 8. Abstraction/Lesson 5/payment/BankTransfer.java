package payment;

public class BankTransfer extends Payment{
	public void processPayment(double amount){
		System.out.println("\nProcessing $" + amount + " using Bank Transfer...");
	}
}