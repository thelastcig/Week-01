import java.util.Scanner;

public class IllegalArgumentExceptionDemo {

    public static void generateException(String input) {
        
        System.out.println("Substring: " + input.substring(5, 3));
    }

    
    public static void handleException(String input) {
        try {
            
            System.out.println("Substring: " + input.substring(5, 3));
        } catch (IllegalArgumentException e) {
            
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
           
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("\nGenerating IllegalArgumentException:");
        try {
            generateException(userInput); 
        } catch (Exception e) {
          System.out.println("Caught Exception in main: " + e.getMessage());
        }

        System.out.println("\nHandling IllegalArgumentException:");
        handleException(userInput); 

        scanner.close();
    }
}
