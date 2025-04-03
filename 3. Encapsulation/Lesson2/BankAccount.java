public class BankAccount{
	private int actNumber;
	private String actHolderName;
	private int balance;

	public int getActNumber(){
		return actNumber;
	}

	public String getActHolderName(){
		return actHolderName;
	}

	public int getBalance(){
		return balance;
	}

	public void setActNumber(int actNum){
		this.actNumber = actNum;
	}

	public void setActHolderName(String actHolderName){
		this.actHolderName = actHolderName;
	}

	public void setBalance(int balance){
		this.balance = balance;
	}

	public int deposit(int deposit){
		return deposit;
	}
}