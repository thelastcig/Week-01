import java.util.Scanner;

public class DoubleOperations {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        double a = sc.nextDouble(); //enter the value of a
        System.out.println("Enter the value of b: ");
        double b = sc.nextDouble(); //enter the value of b
        System.out.println("Enter the value of c: ");
        double c = sc.nextDouble(); //enter the value of c

        System.out.printf("The results of Int Operations are %.2f, %.2f, %.2f and %.2f",(a + b *c), (a * b + c), (c + a / b),(a % b + c));
        sc.close();
    }
    
}