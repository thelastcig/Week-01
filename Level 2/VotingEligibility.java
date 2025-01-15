import java.util.Random;

public class VotingEligibility {

    public static void main(String[] args) {
        int numberOfStudents = 10;


        int[] studentAges = generateRandomAges(numberOfStudents);

        String[][] eligibility = checkVotingEligibility(studentAges);

        displayEligibilityTable(eligibility);
    }

    
    public static int[] generateRandomAges(int n) {
        Random random = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = random.nextInt(100) - 50; 
        
        }
        return ages;
    }   

    // Method to check voting eligibility
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];

        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]); 
            if (ages[i] < 0) {
                result[i][1] = "Invalid Age"; 
            } else if (ages[i] >= 18) {
                result[i][1] = "Can Vote";
            } else {
                result[i][1] = "Cannot Vote"; 
            }
        }
        return result;
    }

  
    public static void displayEligibilityTable(String[][] data) {
        System.out.println("\nStudent Voting Eligibility:");
        System.out.println("-----------------------------");
        System.out.println("Age\t\tEligibility");
        System.out.println("-----------------------------");
        for (String[] row : data) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
        System.out.println("-----------------------------");
    }
}
