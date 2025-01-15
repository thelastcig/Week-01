import java.util.Scanner;

public class PalindromeCheck {

    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeWithCharArray(String text) {
        char[] original = text.toCharArray();
        char[] reversed = reverseString(text);

        for (int i = 0; i < original.length; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    
    public static char[] reverseString(String text) {
        char[] reversed = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            reversed[i] = text.charAt(text.length() - 1 - i);
        }
        return reversed;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter a text: ");
        String text = scanner.nextLine();

       
        text = text.toLowerCase().replaceAll("\\s+", "");

        // Logic 1
        boolean resultIterative = isPalindromeIterative(text);
        System.out.println("Palindrome check using iterative method: " + resultIterative);

        // Logic 2
        boolean resultRecursive = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Palindrome check using recursive method: " + resultRecursive);

        // Logic 3
        boolean resultCharArray = isPalindromeWithCharArray(text);
        System.out.println("Palindrome check using character array method: " + resultCharArray);

        scanner.close();
    }
}
