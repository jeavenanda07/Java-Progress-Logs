public class MenuItem {
    String food;
    int price;

    public MenuItem(String food, int price){
        this.food = food;
        this.price = price;
    }

    public void displayMenu(){
        System.out.println(food + " - " + price);
    }
}
