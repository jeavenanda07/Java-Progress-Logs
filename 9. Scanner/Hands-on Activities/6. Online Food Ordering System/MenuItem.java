class MenuItem {
    String food;
    int price;

    public MenuItem(String food, int price){
        this.food = food;
        this.price = price;
    }

    public void display(int i) {
        System.out.println((i + 1) + ". " + food + " - " + price + "php");
    }
}
