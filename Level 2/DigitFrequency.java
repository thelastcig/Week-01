import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = scanner.nextLong();

        String numStr = String.valueOf(number);

        // Array to store frequency of each digit (0-9)
        int[] frequency = new int[10];

        
        for (int i = 0; i < numStr.length(); i++) {
            
            int digit = numStr.charAt(i) - '0';
            
            frequency[digit]++;
        }
        System.out.println("\nDigit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + ": " + frequency[i] + " times");
            }
        }

        scanner.close();
    }
    
}