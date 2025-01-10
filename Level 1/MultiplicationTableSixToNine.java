import java.util.Scanner;

public class MultiplicationTableSixToNine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its multiplication table from 6 to 9: ");
        int number = sc.nextInt();

        int[] multiplicationResult = new int[4]; // 4 results we need

        for (int i = 0; i < multiplicationResult.length; i++) {
            multiplicationResult[i] = number * (i + 6); //range is 6 to 9
        }

        // Display
        System.out.println("Multiplication table of " + number + " from 6 to 9:");
        for (int i = 0; i < multiplicationResult.length; i++) {
            System.out.println(number + " x " + (i + 6) + " = " + multiplicationResult[i]);
        }

        sc.close(); 
    }
}   