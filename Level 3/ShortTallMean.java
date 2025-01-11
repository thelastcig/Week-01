import java.util.*;

public class ShortTallMean {
    public static int[] generateHeights(int size) {
        int[] heights = new int[size];
        for (int i = 0; i < size; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; 
        }
        return heights;
    }


    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    
    public static double findMean(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

  
    public static int findShortest(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            shortest = Math.min(shortest, height);
        }
        return shortest;
    }

    public static int findTallest(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            tallest = Math.max(tallest, height);
        }
        return tallest;
    }

    public static void main(String[] args) {
        int teamSize = 11; 
        int[] heights = generateHeights(teamSize);

        
        System.out.println("Player Heights (in cm): " + Arrays.toString(heights));

       
        int sum = findSum(heights);
        double mean = findMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.printf("Sum of Heights: %d cm%n", sum);
        System.out.printf("Mean Height: %.2f cm%n", mean);
        System.out.printf("Shortest Height: %d cm%n", shortest);
        System.out.printf("Tallest Height: %d cm%n", tallest);
    }
    
}
