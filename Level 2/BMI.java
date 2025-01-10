import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        double[] heights = new double[n];
        double[] weights = new double[n];
        double[] bmis = new double[n];
        String[] statuses = new String[n];

       
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            System.out.print("Height (in cm): ");
            heights[i] = scanner.nextDouble();
            System.out.print("Weight (in kg): ");
            weights[i] = scanner.nextDouble();
        }

        // Calculate BMI 
        for (int i = 0; i < n; i++) {
            double heightInMeters = heights[i] / 100; 
            bmis[i] = weights[i] / (heightInMeters * heightInMeters); // BMI formula

            
            if (bmis[i] <= 18.4) {
                statuses[i] = "Underweight";
            } else if (bmis[i] <= 24.9) {
                statuses[i] = "Normal";
            } else if (bmis[i] <= 39.9) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }

        // Display 
        System.out.println("\nResults:");
        System.out.println("Height (cm)\tWeight (kg)\tBMI\t\tStatus");
        for (int i = 0; i < n; i++) {
            System.out.println(heights[i] + "\t\t" + weights[i] + "\t\t" + bmis[i] + "\t" + statuses[i]);
        }

        scanner.close();
    }
}