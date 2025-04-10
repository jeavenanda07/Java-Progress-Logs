package payment;

public class BankTransfer extends Payment{
	public void processPayment(double amount){
		System.out.println("Processing $" + amount + " using Bank Transfer...");
	}
}