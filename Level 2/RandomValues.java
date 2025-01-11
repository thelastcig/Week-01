import java.util.*;

public class RandomValues {
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = (int) (Math.random() * 9000) + 1000; // Generate 4-digit random numbers
        }
        return numbers;
    }

    
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0];
        int max = numbers[0];
        int sum = 0;

        for (int number : numbers) {
            sum += number;
            min = Math.min(min, number);
            max = Math.max(max, number);
        }

        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5; 

        
        int[] randomNumbers = generate4DigitRandomArray(size);
        System.out.println("Generated Random Numbers: " + Arrays.toString(randomNumbers));

       
        double[] results = findAverageMinMax(randomNumbers);

      
        System.out.printf("Average: %.2f%n", results[0]);
        System.out.printf("Minimum: %.0f%n", results[1]);
        System.out.printf("Maximum: %.0f%n", results[2]);
    }
}
