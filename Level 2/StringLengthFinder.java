import java.util.Scanner;

public class StringLengthFinder {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next(); 
        sc.close();

        
        int customLength = findLengthWithoutLengthMethod(input);
        
      
        int actualLength = input.length();


        System.out.println("Length using user-defined method: " + customLength);
        System.out.println("Length using built-in method: " + actualLength);
    }

   
    public static int findLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); 
                count++; 
            }
        } catch (IndexOutOfBoundsException e) {
            
        }
        return count; 
    }
}
