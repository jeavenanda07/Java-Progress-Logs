class OrderSummary {
    String username;
    int[] numberOrder;
    MenuItem[] menu;
    int totalPrice;

    public OrderSummary(String username, int[] numberOrder, MenuItem[] menu){
        this.username = username;
        this.numberOrder = numberOrder;
        this.menu = menu;
    }    


    public void summary() {
      System.out.println("\nOrder summary for " + username + ":");

      for(int i = 0; i < numberOrder.length ; i++){
        switch (numberOrder[i]) {
            case 1:
                System.out.println(menu[i].food + " : " + menu[i].price);
                totalPrice += menu[i].price;
                break;
            case 2:
                System.out.println(menu[i].food + " : " + menu[i].price);
                totalPrice += menu[i].price;
                break;
            case 3:
                System.out.println(menu[i].food + " : " + menu[i].price);
                totalPrice += menu[i].price;
                break;
            case 4:
                System.out.println(menu[i].food + " : " + menu[i].price);
                totalPrice += menu[i].price;
                break;
            default:
                System.out.println("Food Not Found");
                break;
        }
      }

      
      System.out.println("Total bill: " +  totalPrice + "php\n");
    }
}
