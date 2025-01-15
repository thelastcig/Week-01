import java.util.Scanner;

public class StringIndexOutOfBoundsExceptionDemo {

    public static void generateException(String input) {
        
        System.out.println("Character at index 100: " + input.charAt(100));
    }

    public static void handleException(String input) {
        try {
            
            System.out.println("Character at index 100: " + input.charAt(100));
        } catch (StringIndexOutOfBoundsException e) {
            
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        System.out.println("\nGenerating StringIndexOutOfBoundsException:");
        try {
            generateException(userInput); 
        } catch (Exception e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }

        System.out.println("\nHandling StringIndexOutOfBoundsException:");
        handleException(userInput); 
        scanner.close();
    }
}