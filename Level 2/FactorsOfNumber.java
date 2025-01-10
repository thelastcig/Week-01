import java.util.Scanner;

public class FactorsOfNumber {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number to find its factors: ");
        int number = sc.nextInt();

        System.out.println("The factors of " + number + " are:");
        for (int i = 1; i <= number; i++) { // Loop through numbers from 1 to the number
            if (number % i == 0) { // Check if i is a factor of the number
                System.out.println(i); 
            }
        }

        sc.close(); 
    }
}

