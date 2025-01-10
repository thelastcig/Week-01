import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

       
        int temp = number;
        int digitCount = 0;
        while (temp != 0) {
            temp /= 10;
            digitCount++;
        }

        
        int[] digits = new int[digitCount];

        
        temp = number;
        for (int i = 0; i < digitCount; i++) {
            digits[i] = temp % 10; // Extract last digit
            temp /= 10;           
        }

        
        System.out.println("Digits of the number in reverse order:");
        for (int i = 0; i < digitCount; i++) {
            System.out.print(digits[i]);
        }

        scanner.close();
    }
}

