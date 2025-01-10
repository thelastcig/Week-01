import java.util.Scanner;

public class WhileSumUntilNegative {
    public static void main(String[] args) {
        double total = 0.0; // Variable to store the sum
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter numbers to add to the total. Enter 0 or a negative number to stop:");

        while (true) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();

            if (num <= 0) { // Exit condition
                break;
            }

            total += num; 
        }

        System.out.println("The total sum is: " + total);
        sc.close(); 
    }
}