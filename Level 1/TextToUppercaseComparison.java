import java.util.Scanner;

public class TextToUppercaseComparison {

    
    public static String convertToUpperCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (ch >= 'a' && ch <= 'z') {
                
                ch = (char) (ch - 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the text: ");
        String userInput = scanner.nextLine();

        // Convert to uppercase using the built-in method
        String builtInUppercase = userInput.toUpperCase();

      
        String customUppercase = convertToUpperCase(userInput);

       
        boolean areEqual = compareStrings(builtInUppercase, customUppercase);

      
        System.out.println("Built-in Uppercase: " + builtInUppercase);
        System.out.println("Custom Uppercase: " + customUppercase);
        System.out.println("Are both methods producing the same result? " + areEqual);

        scanner.close();
    }
}
