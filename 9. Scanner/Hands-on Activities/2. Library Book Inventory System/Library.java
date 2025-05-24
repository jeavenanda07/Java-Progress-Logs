import java.util.Scanner;

class Library {
    public static void main(String[] args) {
        String[] books = {"Harry Potter", "Hunger Games", "Twilight", "Pride and Prejudice"};

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nEnter your name:");
        String userName = scanner.nextLine();

        System.out.println("\nAvailable Books:");
        
        for(int i = 0; i < books.length; i++){
            String book = books[i];
            int bookNum = i + 1;
            System.out.println(bookNum + ". " + book);
        }

        System.out.print("\nEnter the number of the book to borrow: ");
        int numPicked = scanner.nextInt();

        switch (numPicked) {
            case 1:
                System.out.println("\nThank you, " + userName + ". You have borrowed " + books[0] + ".\n");
                break;
            case 2:
                System.out.println("\nThank you, " + userName + ". You have borrowed " + books[1] + ".\n");
                break;
            case 3:
                 System.out.println("\nThank you, " + userName + ". You have borrowed " + books[2] + ".\n");
                 break;
            case 4:
                  System.out.println("\nThank you, " + userName + ". You have borrowed " + books[3] + ".\n");
                  break;
            default:
                System.out.println("\nInvalid Number");
                break;
        }

       scanner.close();
    }
}
