import java.util.Scanner;
public class IntOperations {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt(); //enter the value of a
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt(); //enter the value of b
        System.out.println("Enter the value of c: ");
        int c = sc.nextInt(); //enter the value of c

        System.out.println("The results of Int Operations are " + (a + b *c) + ", " + (a * b + c) + ", " + (c + a / b) + " and " + (a % b + c));
        sc.close();
    }
    
}
