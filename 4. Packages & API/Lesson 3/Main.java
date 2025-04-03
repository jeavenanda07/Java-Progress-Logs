//import scanner package
import java.util.Scanner;

class Main{
	public static void main(String[] args){
		//System.in param is use to scan system input
		Scanner userInput = new Scanner(System.in);


		//nextLine method is used to scan String input
        	System.out.println("Enter user name:");
        	String userName = userInput.nextLine(); 

		//nextInt method is used to scan Integer input
        	System.out.println("Enter your age:");
        	int userAge = userInput.nextInt();


        	userInput.nextLine(); // Consume the leftover newline

        	System.out.println("Your username is " + userName + " and you are " + userAge + " years old");

		//close method is used to close the scanner to avoid leak resources
        	userInput.close();   
	}
}