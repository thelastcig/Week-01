import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to check if it is a prime number: ");
        int number = sc.nextInt();
        
        
        boolean isPrime = true;
        
        // Check if the number is greater than 1
        if (number > 1) {
            // Loop through numbers from 2 to number-1
            for (int i = 2; i < number; i++) {
                
                if (number % i == 0) {
                    isPrime = false; // The number is divisible, so it's not prime
                    break; 
                }
            }
        } else {
            isPrime = false; // Numbers less than or equal to 1 are not prime
        }
        
        
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        sc.close(); 
    }
}