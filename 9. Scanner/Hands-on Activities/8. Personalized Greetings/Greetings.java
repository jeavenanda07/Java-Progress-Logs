import java.util.Scanner;

class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nWhat is your name?");
        String username = scanner.nextLine();

        System.out.println("Hello, how are you " + username + "?\n");
    }    
}
