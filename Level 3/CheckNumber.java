import java.util.*;
public class CheckNumber {
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    public static int[] getDigitsArray(int number) {
        String numStr = String.valueOf(Math.abs(number)); 
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        return digits;
    }

    
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    public static boolean areArraysEqual(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    
    public static boolean isPalindrome(int number) {
        int[] digits = getDigitsArray(number);
        int[] reversed = reverseArray(digits);
        return areArraysEqual(digits, reversed);
    }

   
    public static boolean isDuckNumber(int[] digits) {
        
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int number = 12321; 
        System.out.println("Number: " + number);

        
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        
        int[] reversed = reverseArray(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversed));

        
        boolean isPalindromeNumber = isPalindrome(number);
        System.out.println("Is Palindrome: " + isPalindromeNumber);

        
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);

        
        boolean arraysEqual = areArraysEqual(digits, reversed);
        System.out.println("Are Original and Reversed Arrays Equal: " + arraysEqual);
    }
}    
