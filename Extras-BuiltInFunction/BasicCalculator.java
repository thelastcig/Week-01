import java.util.Scanner;

public class BasicCalculator {

    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error: Division by zero.");
            return Double.NaN;
        }
    }

    public static double getInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static void displayResult(double result) {
        System.out.println("The result is: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Select an operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");

        int choice = scanner.nextInt();

        double num1 = getInput("Enter the first number: ");
        double num2 = getInput("Enter the second number: ");
        
        double result = 0;
        
        switch (choice) {
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = subtract(num1, num2);
                break;
            case 3:
                result = multiply(num1, num2);
                break;
            case 4:
                result = divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation selected.");
                return;
        }
        
        displayResult(result);
        scanner.close();
    }
}
