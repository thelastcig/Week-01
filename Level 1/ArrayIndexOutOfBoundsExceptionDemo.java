import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {

    
    public static void generateException(String[] names) {
        
        System.out.println("Accessing invalid index: " + names[10]);
    }

    public static void handleException(String[] names) {
        try {
            
            System.out.println("Accessing invalid index: " + names[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (RuntimeException e) {
            
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter the number of names: ");
        int size = scanner.nextInt();
        scanner.nextLine(); 

       
        String[] names = new String[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("\nGenerating ArrayIndexOutOfBoundsException:");
        try {
            generateException(names); 
        } catch (Exception e) {
            System.out.println("Caught Exception in main: " + e.getMessage());
        }

        System.out.println("\nHandling ArrayIndexOutOfBoundsException:");
        handleException(names); 

        scanner.close();
    }
}
