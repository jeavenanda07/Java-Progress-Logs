import java.util.Scanner;

class GradeCalculatorTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] grades = new int[5];

        System.out.println("Enter a grade for 5 subjects: ");

        for(int i = 0; i < grades.length; i++){
            System.out.println("Grade " + (i + 1) +  ": ");
            grades[i] = scanner.nextInt();
        }

        double average = calculateAverage(grades);
        System.out.println("\nAverage: " + average);
        System.out.println("Status: " + (average >= 75 ? "Passed" : "Failed"));
        System.out.println("Letter Grade: " + getLetterGrade(average));
    }

    static double calculateAverage(int[] arr){
        int sum = 0;
        for(int g : arr){
            sum += g;
        }

        return sum / arr.length;
    }

    static String getLetterGrade(double avg){
        if (avg >= 97) return "A+";
        else if (avg >= 93 ) return "A";
        else if (avg >= 89) return "B+";
        else if (avg >= 85) return "B";
        else if (avg >= 80) return "C+";
        else if (avg >= 75) return "C";
        else return "F";
    }
}
