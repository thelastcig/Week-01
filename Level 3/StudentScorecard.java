import java.util.Scanner;
import java.util.Random;

public class StudentScorecard {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

     
        int[][] pcmScores = generateRandomScores(numStudents);

        
        double[][] results = calculateResults(pcmScores);

      
        displayScorecard(pcmScores, results);
    }

    
    public static int[][] generateRandomScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(41) + 60; // Random score between 60 and 100 for Physics
            scores[i][1] = random.nextInt(41) + 60; // Random score between 60 and 100 for Chemistry
            scores[i][2] = random.nextInt(41) + 60; // Random score between 60 and 100 for Math
        }
        return scores;
    }

    
    public static double[][] calculateResults(int[][] scores) {
        int numStudents = scores.length;
        double[][] results = new double[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            results[i][0] = total;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }

    
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("\nScorecard:");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.0f\t%.2f\t%.2f%%\n",
                    (i + 1), scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2]);
        }
    }
}
