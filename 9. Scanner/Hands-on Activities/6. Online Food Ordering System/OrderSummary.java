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
                System.out.println(menu[0].food + " : " + menu[0].price);
                totalPrice += menu[i].price;
                break;
            case 2:
                System.out.println(menu[1].food + " : " + menu[1].price);
                totalPrice += menu[i].price;
                break;
            case 3:
                System.out.println(menu[2].food + " : " + menu[2].price);
                totalPrice += menu[i].price;
                break;
            case 4:
                System.out.println(menu[3].food + " : " + menu[3].price);
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
