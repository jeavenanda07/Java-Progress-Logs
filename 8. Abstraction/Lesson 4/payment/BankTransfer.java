package payment;

public class BankTransfer extends Payment{
	public void processPayment(double amount){
		System.out.println("Processing $" + amount + " using Bank Transfer...");
	}

	public void paymentAccess(String payment, double amount){
		if(payment.equals("Bank Transfer")){
			//BankTransfer bankTransper = new BankTransfer();
			this.processPayment(amount);
		}
	}

}