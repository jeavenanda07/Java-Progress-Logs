//JEAVEN A. PARAS

import java.util.Scanner;

class Book {
    String title;
    String author;
    int yearPublished;

    Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }
}

public class BookCatalog {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Book[] books = new Book[4];

        for (int i = 0; i < books.length; i++) {
            System.out.print("\nEnter book title: ");
            String title = scanner.nextLine();
            System.out.print("Enter author: ");
            String author = scanner.nextLine();
            System.out.print("Enter year published: ");
            int year = scanner.nextInt();
            scanner.nextLine(); // consume newline
            books[i] = new Book(title, author, year);

            System.out.println("");
        }


        System.out.println("\nBooks published after 2015:");
        for (Book b : books) {
            if (b.yearPublished > 2015) {
                System.out.println(b.title + " by " + b.author + " (" + b.yearPublished + ")");
            }
        }
        scanner.close();
    }
}
