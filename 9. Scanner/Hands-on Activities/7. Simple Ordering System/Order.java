import java.util.Scanner;

public class Order {
    MenuItem[] menuItem;
    int quantity;
    int choice;

    public Order(MenuItem[] menuItem, int choice){
        this.menuItem = menuItem;
        this.choice = choice;
    }

    public void displayOrder(){
        Scanner scanner = new Scanner(System.in);
    
        switch (choice) {
            case 1:
                System.out.println("You ordered: " + menuItem[0].food);
                break;
            case 2:
                System.out.println("You ordered: " + menuItem[1].food);
                break;
            case 3:
                System.out.println("You ordered: " + menuItem[2].food);
                break;
            default:
                System.out.println("Invalid input");
                break;
        }

        if(choice >= 1 && choice <=3) {
            System.out.print("Enter quantity: ");
            quantity = scanner.nextInt(); 
        }
    }

    public void calculateTotal(){
        if(choice >= 1 && choice <=3) {
            System.out.println("Total: " + (menuItem[choice - 1].price * quantity) + "\n");
        }
    }
}
