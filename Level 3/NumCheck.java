import java.util.*;

public class NumCheck {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }

    
    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String numStr = String.valueOf(number);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = sc.nextInt(); 
        //System.out.println("Number: " + number);

        
        boolean isPrimeNumber = isPrime(number);
        System.out.println("Is Prime: " + isPrimeNumber);

       
        boolean isNeonNumber = isNeon(number);
        System.out.println("Is Neon Number: " + isNeonNumber);

        
        boolean isSpy = isSpyNumber(number);
        System.out.println("Is Spy Number: " + isSpy);

        
        boolean isAutomorphicNumber = isAutomorphic(number);
        System.out.println("Is Automorphic Number: " + isAutomorphicNumber);

       
        boolean isBuzz = isBuzzNumber(number);
        System.out.println("Is Buzz Number: " + isBuzz);
    }
}    