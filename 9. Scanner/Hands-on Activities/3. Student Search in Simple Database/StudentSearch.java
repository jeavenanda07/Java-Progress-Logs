import java.util.Scanner;

class StudentSearch {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "RodAngelvert"};
        Scanner scanner = new Scanner(System.in);
  
        System.out.println("Enter student name to search: ");
        String name = scanner.nextLine();

        boolean result = searchStudent(names, name);
        
        if(result){
            System.out.println("\nStudent is enrolled");
        } else {
            System.out.println("\nStudent not found");
        }
    }   

    static boolean searchStudent(String[] names, String search){
        for(String n: names){
            if(n.equals(search)){
                return true;
            }
        }

        return false;
    }
}
