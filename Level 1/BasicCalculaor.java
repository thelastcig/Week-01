import java.util.Scanner;;
public class BasicCalculaor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        double num1 = sc.nextDouble();
        System.out.println("Enter num2: ");
        double num2 = sc.nextDouble();

        double add = num1 + num2;
        double subtract = num1 - num2;
        double multiply = num1 * num2;
        double divide = num1 / num2;

        System.out.printf(" The addition, subtraction, multiplication and division value of 2 numbers " + num1 + " and " + num2 + " is %.2f, %.2f, %.2f and %.2f", add, subtract, multiply, divide );


    }
    
}
