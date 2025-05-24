import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MenuItem[] menu = {
            new MenuItem("Burger", 50),
            new MenuItem("Fries", 30),
            new MenuItem("Soda", 20)
        };

        System.out.println("\nAvailable items: ");

        for(int i = 0; i < menu.length; i++){
            System.out.print((i + 1 ) + ". ");
            menu[i].displayMenu();
        }

        System.out.print("\nEnter item number (1-3): ");
        int choice = scanner.nextInt();

        Order order = new Order(menu, choice);
        order.displayOrder();
        order.calculateTotal();
        //order;
    }
}
