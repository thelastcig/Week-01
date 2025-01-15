import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    public static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low + 1) + low;
    }

    public static String getUserFeedback() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Is the guess correct? (yes/no). If not, is the guess too high or too low? ");
        return scanner.nextLine().toLowerCase();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;
        int guess;
        
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        
        while (true) {
            guess = generateGuess(low, high);
            System.out.println("My guess is: " + guess);
            
            feedback = getUserFeedback();
            
            if (feedback.equals("yes")) {
                System.out.println("Yay! I guessed your number.");
                break;
            } else if (feedback.contains("high")) {
                high = guess - 1;
            } else if (feedback.contains("low")) {
                low = guess + 1;
            } else {
                System.out.println("Invalid feedback. Please respond with 'yes', 'high', or 'low'.");
            }
        }
        
        scanner.close();
    }
}
