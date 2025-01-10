import java.util.Scanner;
public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        
        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // Check if 'i' is a factor of 'number'
                greatestFactor = i;
                break; // Break as soon as the greatest factor is found
            }
        }

   
        System.out.println("The greatest factor of " + number + " (besides itself) is: " + greatestFactor);

        sc.close();
    }
}  

