import java.util.Scanner;

public class MultipleSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] numbers = new double[10]; // Array to store up to 10 elements
        double sum = 0.0;                
        int index = 0;                 

        System.out.println("Enter up to 10 numbers (Enter 0 or a negative number to stop):");

        while (true) {
            System.out.print("Enter number " + (index + 1) + ": ");
            double input = sc.nextDouble();

            if (input <= 0 || index == 10) {
                
                break;
            }

            numbers[index] = input; // Store the input in the array
            index++;               
        }

       
        for (int i = 0; i < index; i++) {
            sum += numbers[i];
        }

        // Display 
        System.out.println("\nNumbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }

        
        System.out.println("\nsum: " + sum);

        sc.close(); 
    }
}