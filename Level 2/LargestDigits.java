import java.util.Scanner;

public class LargestDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int maxDigit = 10; 
        int[] digits = new int[maxDigit];
        int index = 0;

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Store digits 
        while (number != 0) {
            if (index >= maxDigit) {
                System.out.println("Max digits reached, some digits were not stored.");
                break;
            }
            digits[index] = number % 10; // Extract the last digit
            number /= 10; 
            index++;
        }

        
        int largest = 0;
        int secondLargest = 0;

        // to find the largest and second largest digits
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display 
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);

        scanner.close();
    }
}