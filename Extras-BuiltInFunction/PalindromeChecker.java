import java.util.Scanner;

public class PalindromeChecker {

    public static String getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    public static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void displayResult(boolean result) {
        if (result) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    public static void main(String[] args) {
        String inputString = getInput();
        boolean result = isPalindrome(inputString);
        displayResult(result);
    }
}
