import java.util.Scanner;

public class TextProcessing {

    
    public static String convertToLowerCase(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is uppercase
            if (ch >= 'A' && ch <= 'Z') {
                // Convert to lowercase by adding 32 to ASCII value
                ch = (char) (ch + 32);
            }
            result.append(ch);
        }
        return result.toString();
    }

    // Method to compare two strings character by character
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

    
    public static String[][] splitTextIntoWords(String input) {
        String[] words = input.split("\\s+");
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(words[i].length());
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the text: ");
        String userInput = scanner.nextLine();

        
        String builtInLowercase = userInput.toLowerCase();

       
        String customLowercase = convertToLowerCase(userInput);

        
        boolean areEqual = compareStrings(builtInLowercase, customLowercase);

       
        String[][] wordsAndLengths = splitTextIntoWords(userInput);

        
        System.out.println("Built-in Lowercase: " + builtInLowercase);
        System.out.println("Custom Lowercase: " + customLowercase);
        System.out.println("Are both methods producing the same result? " + areEqual);

        System.out.println("Words and their lengths:");
        for (String[] wordInfo : wordsAndLengths) {
            System.out.println("Word: " + wordInfo[0] + ", Length: " + wordInfo[1]);
        }

        scanner.close();
    }
}
