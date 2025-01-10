import java.util.Scanner;

public class ForFactorial {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number to find factorial: ");
    int num = sc.nextInt();
    if (num < 0) {
        System.out.println("Factorial is not defined for negative numbers. Please enter a non-negative number.");
    }else{
        int fact = 1;
        int temp = num; // Temporary variable to preserve the original number
        for(int i = 1; i<=temp; i++){
            fact *= i;
        }
        System.out.println("The factorial is: " + fact);
    }
    
    }
    
    
}
