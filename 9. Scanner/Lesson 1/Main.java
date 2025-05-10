import java.util.Scanner;

class MainP{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.println("Enter your Age:");
        double age = scanner.nextInt();
        System.out.println("Your name is " + name + " you're " + age + " of age");
    }
}