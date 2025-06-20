//Jeaven A. Paras

import java.util.Scanner;

class Product {
    String productName;
    int quantity;

    Product(String productName, int quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }
}

public class ProductInventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Product[] products = new Product[5];

        for (int i = 0; i < products.length; i++) {
            System.out.print("Enter product name: ");
            String name = scanner.nextLine();
            System.out.print("Enter quantity: ");
            int qty = scanner.nextInt();
            scanner.nextLine(); 
            products[i] = new Product(name, qty);
            System.out.println("");
        }

        System.out.println("\nProducts with quantity less than 10:");
        for (Product p : products) {
            if (p.quantity < 10) {
                System.out.println(p.productName + " - " + p.quantity);
            }
        }
        scanner.close();
    }
}
