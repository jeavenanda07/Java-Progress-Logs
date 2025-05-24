//JEAVEN A. PARAS

import java.util.Scanner;

class ATM {
    static double balance = 1000;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do{
            System.out.println("\n---ATM Menu----");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("\nChoose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    exit();
                    break;
                default:
                    System.out.println("Invalid Value");
                    break;
            }
        } while (choice != 4);
    }

    static void checkBalance(){
        System.out.println("\nYour balance is " + balance + "php");
    }

    static void deposit(Scanner scanner){
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextInt();

        balance += amount;
        System.out.println("\nDeposit Successfull!");
        System.out.println("Your balance is " + balance  + "php");
    }

    static void withdraw(Scanner scanner){
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();

        if(amount > balance){
            System.out.println("insufficient balance ");
        } else if(amount <= 0) {
            System.out.println("Enter a valid amount");
        } else {
            balance -= amount;
            System.out.println("\nYou withdraw: " + amount  + "php");
            System.out.println("Current balance: " + balance  + "php");
        }
    }

    static void exit(){
        System.out.println("\nExit successful");
      //  scanner.close();
    }
}

