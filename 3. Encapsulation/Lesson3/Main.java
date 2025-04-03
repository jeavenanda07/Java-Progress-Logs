class Main{
	public static void main(String[] args){
		BankAccount act1= new BankAccount("Jeaven Anda", 10192, 1000d);
		System.out.println("\nAccount Number: " + act1.getActNumber());	
		System.out.println("Account Balance: $" + act1.getBalance());
		System.out.println("Account Holder Name: #" + act1.getActHolderName());
		
		act1.withdraw(0d);
		act1.deposit(200d);

		System.out.print("Updated Total Balance: $" + act1.getBalance());
	}
}