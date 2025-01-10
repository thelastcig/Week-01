import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the number of students: ");
        int numberOfStudents = scanner.nextInt();


        int[][] marks = new int[numberOfStudents][3]; // [physics, chemistry, maths]
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for student " + (i + 1) + ":");

            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";
                do {
                    System.out.print(subject + " marks (positive value only): ");
                    marks[i][j] = scanner.nextInt();
                    if (marks[i][j] < 0) {
                        System.out.println("Marks must be a positive value. Please try again.");
                    }
                } while (marks[i][j] < 0);
            }
        }

        // Calculate percentages and grades
        for (int i = 0; i < numberOfStudents; i++) {
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            percentages[i] = (totalMarks / 3.0);

           
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display
        System.out.println("\nResults:");
        System.out.println("Physics\tChemistry\tMaths\tPercentage\tGrade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("%d\t\t%d\t\t%d\t\t%.2f\t\t%c%n",
                    marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }

        scanner.close();
    }
    
}
