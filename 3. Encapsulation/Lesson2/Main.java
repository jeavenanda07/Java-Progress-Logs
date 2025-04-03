class Main{
	public static void main(String[] args){
		BankAccount act1= new BankAccount();
		int deposit = act1.deposit(1034);
		act1.setActNumber(98510);
		act1.setActHolderName("Jeaven Anda");
		act1.setBalance(deposit);

		System.out.println(act1.getActNumber());	
		System.out.println(act1.getBalance());
		System.out.println(act1.getActHolderName());
		
		//System.out.print(depositNum);
	}
}