import java.util.Scanner;

class OrderingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuItem[] menu = {
            new MenuItem("Burger", 80),
            new MenuItem("Pizza",  120),
            new MenuItem("Fries", 40),
            new MenuItem("Soda", 25)
        };
        int[] numberOrder = new int[3];

        System.out.print("\nEnter your name:");
        String username = scanner.nextLine();


        System.out.println("\nMenu:");
        for(int i = 0; i < menu.length; i++){
            menu[i].display(i);
        }

        System.out.print("\nSelects up to 3 times (enter numbers seperated): ");

        for(int i = 0; i < numberOrder.length; i++){
            numberOrder[i] = scanner.nextInt();
        }

        OrderSummary orderSummary = new OrderSummary(username, numberOrder, menu);
        orderSummary.summary();
    }
}
