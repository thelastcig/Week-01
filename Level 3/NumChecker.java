import java.util.*;

public class NumChecker {
    public static int[] findFactors(int number) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        return factors.stream().mapToInt(i -> i).toArray();
    }

    
    public static int findGreatestFactor(int[] factors) {
        int greatest = Integer.MIN_VALUE;
        for (int factor : factors) {
            if (factor > greatest) {
                greatest = factor;
            }
        }
        return greatest;
    }

    
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    
    public static long findProductOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    
    public static long findProductOfCubesOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    
    public static boolean isPerfectNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) { 
                sum += factor;
            }
        }
        return sum == number;
    }

    public static boolean isAbundantNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum > number;
    }

   
    public static boolean isDeficientNumber(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            if (factor != number) {
                sum += factor;
            }
        }
        return sum < number;
    }

    
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    
    private static int factorial(int number) {
        if (number == 0 || number == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: " );
        int number = sc.nextInt(); 
        
        

        
        int[] factors = findFactors(number);
        System.out.println("Factors: " + java.util.Arrays.toString(factors));

        
        int greatestFactor = findGreatestFactor(factors);
        System.out.println("Greatest Factor: " + greatestFactor);

        int sumOfFactors = findSumOfFactors(factors);
        System.out.println("Sum of Factors: " + sumOfFactors);

   
        long productOfFactors = findProductOfFactors(factors);
        System.out.println("Product of Factors: " + productOfFactors);

       
        long productOfCubes = findProductOfCubesOfFactors(factors);
        System.out.println("Product of Cubes of Factors: " + productOfCubes);

        
        boolean isPerfect = isPerfectNumber(number);
        System.out.println("Is Perfect Number: " + isPerfect);

        
        boolean isAbundant = isAbundantNumber(number);
        System.out.println("Is Abundant Number: " + isAbundant);

       
        boolean isDeficient = isDeficientNumber(number);
        System.out.println("Is Deficient Number: " + isDeficient);

        
        boolean isStrong = isStrongNumber(number);
        System.out.println("Is Strong Number: " + isStrong);
    }
}    