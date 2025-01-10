import java.util.Scanner;

public class MultiplesOfNumber {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its multiples below 100: ");
        int number = sc.nextInt();
        System.out.println("The multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) { 
            if (i % number == 0) { // Check if 'i' is a multiple of 'number'
                System.out.println(i); // Print the multiple
            }
        }

        sc.close();
    }
}