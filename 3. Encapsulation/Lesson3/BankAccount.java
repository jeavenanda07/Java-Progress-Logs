public class BankAccount{
	private int actNumber;
	private String actHolderName;
	private double balance;

	public BankAccount(String actHolderName, int actNumber, double balance){
		this.actHolderName = actHolderName;
		this.actNumber = actNumber;
		this.balance = balance;
	}

	public int getActNumber(){
		return actNumber;
	}

	public String getActHolderName(){
		return actHolderName;
	}

	public double getBalance(){
		return balance;
	}

/*	public void setBalance(double balance){
		this.balance = balance;
	}
*/
	public void deposit(double amount){
		if(amount > 0 ){
			balance += amount;
			System.out.println("Deposited: $" + amount);
		}  else{
			System.out.println("Invalid deposit");
		}
	}

	public void withdraw(double amount){
		if(amount > 0 && amount <= balance){
			balance -= amount;
			System.out.println("Withdraw: $" + amount);
		}else{
			System.out.println("Insufficient balance");
		}
	}
}