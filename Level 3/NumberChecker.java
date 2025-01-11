import java.util.*;

public class NumberChecker {

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

   
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) return true; 
        }
        return false;
    }

    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigitsArray(number);
        int power = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit < largest) {
                secondLargest = digit;
            }
        }

        return new int[]{largest, secondLargest};
    }

    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit > smallest) {
                secondSmallest = digit;
            }
        }

        return new int[]{smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; 
        System.out.println("Number: " + number);

     
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

    
        int[] digits = getDigitsArray(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

    
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);

   
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong Number: " + isArmstrong);

      
        int[] largestResults = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestResults[0]);
        System.out.println("Second largest digit: " + largestResults[1]);

        
        int[] smallestResults = findSmallestAndSecondSmallest(digits);
        System.out.println("Smallest digit: " + smallestResults[0]);
        System.out.println("Second smallest digit: " + smallestResults[1]);
    }
}