import java.util.Scanner;

class StudentSearch {
    public static void main(String[] args) {
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Jeaven"};
        Scanner scanner = new Scanner(System.in);
  
        System.out.print("\nEnter student name to search: ");
        String name = scanner.nextLine();

        boolean result = searchStudent(names, name);
        
        if(result){
            System.out.println("Student is enrolled\n");
        } else {
            System.out.println("Student not found \n");
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
