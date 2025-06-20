import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String[] books = {
            "Alchemist",
            "Java For Beginners",
            "Introduction to Algorithms",
            "Harry Potter",
            "Data Structures in Java"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter your name: " );
        String username = scanner.nextLine();

        System.out.print("\nAvailable Books: \n");
        for(int i = 0; i < books.length; i++){
            System.out.println((i + 1) + ". " + books[i]);
        }

        System.out.print("\nEnter the number book to borrow: ");
        int choice = scanner.nextInt();

        if(choice >= 1 && choice <= 5){
            System.out.println("Thank you, " + username + ". You have borrowed \"" + books[choice - 1] + "\". \n");
        } else {
            System.out.println("Invalid Book Number");
        }
    }   
}
