import java.util.Scanner;
public class BMI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your weight in kilograms (kg): ");
        double weight = sc.nextDouble();
        System.out.print("Enter your height in centimeters (cm): ");
        double heightInCm = sc.nextDouble();

    
        double heightInMeters = heightInCm / 100;


        double bmi = weight / (heightInMeters * heightInMeters);

        System.out.printf("Your BMI is: %.2f%n", bmi);

        // Determine weight status based on BMI
        if (bmi < 18.5) {
            System.out.println("Weight Status: Underweight");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("Weight Status: Normal weight");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("Weight Status: Overweight");
        } else {
            System.out.println("Weight Status: Obesity");
        }

        sc.close(); 
    }
}