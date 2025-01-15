import java.util.Random;

public class StudentGrades {

    public static void main(String[] args) {
        int numberOfStudents = 5; 

        
        int[][] scores = generateRandomScores(numberOfStudents);

       
        double[][] studentPerformance = calculatePerformance(scores);

      
        String[] grades = calculateGrades(studentPerformance);

        
        displayScorecard(scores, studentPerformance, grades);
    }

    
    public static int[][] generateRandomScores(int numberOfStudents) {
        Random random = new Random();
        int[][] scores = new int[numberOfStudents][3];
        for (int i = 0; i < numberOfStudents; i++) {
            scores[i][0] = random.nextInt(101);
            scores[i][1] = random.nextInt(101);
            scores[i][2] = random.nextInt(101);
        }
        return scores;
    }

    
    public static double[][] calculatePerformance(int[][] scores) {
        double[][] performance = new double[scores.length][3]; 
        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;
            performance[i][0] = total;
            performance[i][1] = Math.round(average * 100.0) / 100.0;
            performance[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return performance;
    }

    
    public static String[] calculateGrades(double[][] performance) {
        String[] grades = new String[performance.length];
        for (int i = 0; i < performance.length; i++) {
            double percentage = performance[i][2];
            if (percentage >= 80) {
                grades[i] = "A";
            } else if (percentage >= 70) {
                grades[i] = "B";
            } else if (percentage >= 60) {
                grades[i] = "C";
            } else if (percentage >= 50) {
                grades[i] = "D";
            } else if (percentage >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }
        return grades;
    }

    
    public static void displayScorecard(int[][] scores, double[][] performance, String[] grades) {
        System.out.println("\nScorecard:");
        System.out.println("-------------------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAvg\t% \tGrade");
        System.out.println("-------------------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f\t%s\n", 
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    performance[i][0], performance[i][1], performance[i][2], grades[i]);
        }
        System.out.println("-------------------------------------------------------------");
    }
}
