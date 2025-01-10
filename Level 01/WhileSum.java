import java.util.Scanner;

public class WhileSum {
    public static void main(String[] args){
        double total = 0.0; // To store the running total
        Scanner sc = new Scanner(System.in);
        int check = 1;

        while (check != 0) {
            System.out.print("Enter a number to add to the total: ");
            double num = sc.nextDouble();
            total += num; // Add the input to the running total
            
            System.out.println("Current total: " + total);
            System.out.print("Do you want to add another number? Press 1 to continue or 0 to exit: ");
            check = sc.nextInt();
        }

        System.out.println("Final total: " + total);
        sc.close(); // Close the scanner
    }
}