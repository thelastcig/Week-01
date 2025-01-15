import java.util.Scanner;

public class NumberFormatExceptionDemo {

    
    public static void generateException(String input) {
        int number = Integer.parseInt(input);
        System.out.println("Parsed number: " + number);
    }

    public static void handleException(String input) {
        try {
            
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("\nGenerating NumberFormatException:");
        try {
            generateException(userInput); 
        } catch (Exception e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }

        System.out.println("\nHandling NumberFormatException:");
        handleException(userInput); 

        scanner.close();
    }
}
