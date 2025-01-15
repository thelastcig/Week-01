import java.util.Scanner;

public class ReverseString {

    public static String reverseString(String str) {
        String reversed = "";
        
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversedString = reverseString(input);
        
        System.out.println("Reversed string: " + reversedString);
        
        scanner.close();
    }
}
