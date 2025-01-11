import java.util.*;

public class NumberCheckerExtended {
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


    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

 
    public static double sumOfSquaresOfDigits(int[] digits) {
        double sumOfSquares = 0;
        for (int digit : digits) {
            sumOfSquares += Math.pow(digit, 2);
        }
        return sumOfSquares;
    }


    public static boolean isHarshadNumber(int number) {
        int[] digits = getDigitsArray(number);
        int sumOfDigits = sumOfDigits(digits);
        return sumOfDigits != 0 && number % sumOfDigits == 0; 
    }

    
    public static int[][] findDigitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; 
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; 
            frequency[i][1] = 0; 
        }

        for (int digit : digits) {
            frequency[digit][1]++; 
        }

        
        int nonZeroCount = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                nonZeroCount++;
            }
        }

        
        int[][] result = new int[nonZeroCount][2];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                result[index++] = frequency[i];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 153; 
        System.out.println("Number: " + number);

 
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

     
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

       
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        
        double sumSquares = sumOfSquaresOfDigits(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

     
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number: " + isHarshad);

        
        int[][] frequency = findDigitFrequency(digits);
        System.out.println("Digit Frequencies: ");
        for (int[] freq : frequency) {
            System.out.println("Digit " + freq[0] + ": " + freq[1] + " times");
        }
    }
}