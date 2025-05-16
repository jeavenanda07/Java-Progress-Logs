import java.util.Scanner;

class MovieBooking {
    public static void main(String[] args) {
        String[] movies = {"Avengers", "Spider-Man", "Fantastic 4", "Deadpool"};
        int[] seats = {5, 3, 2, 8};

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nAvailable movies :");

        for(int i = 0; i < movies.length; i++){
            System.out.println((i + 1) + ". " + movies[i] + " - Seats: " + seats[i]);
        }

        System.out.println("\nChoose movie number: ");
        int choice = scanner.nextInt();

        if(choice >= 0  && choice < movies.length){
            System.out.println("\nEnter a number of tickets: ");
            int tickets = scanner.nextInt();

            if(tickets <= seats[choice]){
                seats[choice] -= tickets;
                    System.out.println("\nBooking successful for " + tickets + " ticket(s) to " + movies[choice]);
            } else {
                System.out.println("\nNot enough seats available");
            }
        } else{
            System.out.println("\nInvalid movie choice");
        }
    }
}
