import java.util.Scanner;

public class BMICalculator {


    public static String[][] calculateBMI(double[][] heightWeightArray) {
        String[][] bmiStatusArray = new String[10][4];
        
        for (int i = 0; i < heightWeightArray.length; i++) {
            double weight = heightWeightArray[i][0];
            double heightInCm = heightWeightArray[i][1];
            double heightInMeters = heightInCm / 100;
            double bmi = weight / (heightInMeters * heightInMeters);

          
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obesity";
            }

         
            bmiStatusArray[i][0] = String.format("%.2f", weight);
            bmiStatusArray[i][1] = String.format("%.2f", heightInCm);
            bmiStatusArray[i][2] = String.format("%.2f", bmi);
            bmiStatusArray[i][3] = status;
        }
        return bmiStatusArray;
    }

   
    public static void displayResult(String[][] bmiStatusArray) {
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("------------------------------------------------");
        for (String[] row : bmiStatusArray) {
            System.out.printf("%-10s %-10s %-10s %-15s%n", row[0], row[1], row[2], row[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] heightWeightArray = new double[10][2];

        
        System.out.println("Enter weight (in kg) and height (in cm) for 10 persons:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d:%n", i + 1);
            System.out.print("Weight (kg): ");
            heightWeightArray[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            heightWeightArray[i][1] = scanner.nextDouble();
        }

        
        String[][] bmiStatusArray = calculateBMI(heightWeightArray);

    
        System.out.println("\nBMI Results:");
        displayResult(bmiStatusArray);

        scanner.close();
    }
}