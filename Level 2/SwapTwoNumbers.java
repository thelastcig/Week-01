import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println( "Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println( "Enter num2: ");
        int num2 = sc.nextInt();
        int temp;
        temp = num1; // saving the value of num1 in a temp variable
        num1 = num2; //swapping num2 with num1
        num2 = temp; //swapping num1 with num2
        System.out.println("The swapped numbers are " + num1 + " and " + num2);
         
    }
    
}
