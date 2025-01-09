import java.util.Scanner;

public class Division{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: "); //enter number 1
        int num1 = sc.nextInt();
        System.out.println("Enter num2: "); //enter number 2
        int num2 = sc.nextInt();
        float quotient = (float)num1 / (float)num2; //calculate quotient
        int remainder = num1 % num2; //calculate remainder
        System.out.printf("The Quotient is %.2f and remainder is %d of two number %d and %d", quotient, remainder, num1, num2);

    }
}