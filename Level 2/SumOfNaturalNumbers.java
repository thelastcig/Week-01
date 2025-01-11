import java.util.Scanner;

public class SumOfNaturalNumbers {
    
    public static int recursiveSum(int n) {
        if (n == 1) {
            return 1;
        }
        return n + recursiveSum(n - 1);
    }


    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number (n > 0): ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid input! Please enter a natural number greater than 0.");
            return;
        }

     
        int recursiveResult = recursiveSum(n);

        
        int formulaResult = formulaSum(n);

        // Display 
        System.out.println("Sum of first " + n + " natural numbers (recursive method): " + recursiveResult);
        System.out.println("Sum of first " + n + " natural numbers (formula method): " + formulaResult);

        if (recursiveResult == formulaResult) {
            System.out.println("Both results match! The computation is correct.");
        } else {
            System.out.println("The results do not match! There is an error in the computation.");
        }

        sc.close();
    }
}
    

