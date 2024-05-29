import java.util.Scanner;

public class gradecalculator {

    
    public static int calculateTotalMarks(int[] marks) {
        int total = 0;
        for (int mark : marks) {
            total += mark;
        }
        return total;
    }

    
    public static double calculateAveragePercentage(int totalMarks, int numSub) {
        return (double) totalMarks / numSub;
    }

    
    public static String calculateGrade(double averagePercentage) {
        if (averagePercentage >= 90) {
            return "A+";
        } else if (averagePercentage >= 80) {
            return "A";
        } else if (averagePercentage >= 70) {
            return "B+";
        } else if (averagePercentage >= 60) {
            return "B";
        } else if (averagePercentage >= 50) {
            return "C+";
        } else if (averagePercentage >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    
    public static void displayResults(int totalMarks, double averagePercentage, String grade) {
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Average Percentage: " + averagePercentage + "%");
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of subjects: ");
        int numSub = scanner.nextInt();
        int[] marks = new int[numSub];

        for (int i = 0; i < numSub; i++) {
            System.out.print("Enter the marks obtained in subject " + (i + 1) + " (out of 100): ");
            marks[i] = scanner.nextInt();
        }

        int totalMarks = calculateTotalMarks(marks);

        double averagePercentage = calculateAveragePercentage(totalMarks, numSub);

        String grade = calculateGrade(averagePercentage);

        displayResults(totalMarks, averagePercentage, grade);
    }

}

