import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of persons: ");
        int number = scanner.nextInt();

        
        double[][] personData = new double[number][3]; 

  
        String[] weightStatus = new String[number];

       
        for (int i = 0; i < number; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");

        
            do {
                System.out.print("Height (in cm, positive value only): ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be a positive value. Please try again.");
                }
            } while (personData[i][0] <= 0);

          
            do {
                System.out.print("Weight (in kg, positive value only): ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be a positive value. Please try again.");
                }
            } while (personData[i][1] <= 0);
        }

       
        for (int i = 0; i < number; i++) {
            double heightInMeters = personData[i][0] / 100; 
            personData[i][2] = personData[i][1] / (heightInMeters * heightInMeters); // BMI formula

           
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Display 
        System.out.println("\nResults:");
        System.out.println("Height (cm)\tWeight (kg)\tBMI\t	Status");
        for (int i = 0; i < number; i++) {
            System.out.printf("%.2f\t\t%.2f\t\t%.2f\t%s%n",
                    personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}


