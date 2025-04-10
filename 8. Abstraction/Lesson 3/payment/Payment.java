package payment;

public abstract class Payment{
	//creating abstract method
	public abstract void processPayment(double amount);

	public void getPaymentDetails(){
		System.out.println("Payment Initiated \n");
	}
}