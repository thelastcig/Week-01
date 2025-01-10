import java.util.Scanner;

public class YoungestAndTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // store age and height
        int[] ages = new int[3];
        double[] heights = new double[3];

        String[] names = {"Amar", "Akbar", "Anthony"};

        for (int i = 0; i < 3; i++) {
            while (true) {
                try {
                    System.out.println("Enter age of " + names[i] + ": ");
                    ages[i] = scanner.nextInt();
                    if (ages[i] <= 0) {
                        System.out.println("Please enter a positive number.");
                        continue;
                    }

                    System.out.println("Enter height (in cm) of " + names[i] + ": ");
                    heights[i] = scanner.nextDouble();
                    if (heights[i] <= 0) {
                        System.out.println("Please enter a positive number.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter numeric values.");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        // Find the youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display
        System.out.println("\nResults:");
        System.out.println("Youngest friend: " + names[youngestIndex] + " with age " + ages[youngestIndex]);
        System.out.println("Tallest friend: " + names[tallestIndex] + " with height " + heights[tallestIndex] + " cm");

        scanner.close();
    }
}
    