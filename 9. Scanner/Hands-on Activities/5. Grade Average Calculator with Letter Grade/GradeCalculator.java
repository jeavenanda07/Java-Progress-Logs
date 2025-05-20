import java.util.Scanner;

class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] subject = {"English", "Math", "Science", "Filipino", "Ethics"};
        int[] grades = new int[5];

        System.out.println("\nEnter Grade in Subjects :");

        for(int i = 0; i < grades.length; i++){
            System.out.print(subject[i] + ": ");
            grades[i] = scanner.nextInt();
        }

        double average = calculateAvgGrades(grades);
        String status = getGradeStatus(average);
        System.out.println("\nAverage: " + average);
        System.out.println("Status: " + (average < 75 ? "Failed" : "Passed"));
        System.out.println("Letter: " + status + "\n");

    }   
    
    static double calculateAvgGrades(int[] grade){
        int sum = 0;

        for(int g : grade){
            sum += g;
        }

        return sum / grade.length;
    }

    static String getGradeStatus(double avg){
        if (avg >= 97) return "A+";
        else if (avg >= 93 ) return "A";
        else if (avg >= 89) return "B+";
        else if (avg >= 85) return "B";
        else if (avg >= 80) return "C+";
        else if (avg >= 75) return "C";
        else return "F";
    }
}
