import java.util.Scanner;

public class TrigonometricFunctions {

    public double[] calculateTrigonometricFunctions(double angle) {

        double radians = Math.toRadians(angle);

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        
        return new double[]{sine, cosine, tangent};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        TrigonometricFunctions trigFunctions = new TrigonometricFunctions();
        double[] results = trigFunctions.calculateTrigonometricFunctions(angle);

        // Display 
        System.out.printf("Sine(%f°): %.4f%n", angle, results[0]);
        System.out.printf("Cosine(%f°): %.4f%n", angle, results[1]);

        
        if (Math.abs(results[1]) < 1e-10) {
            System.out.printf("Tangent(%f°): Undefined (division by zero)%n", angle);
        } else {
            System.out.printf("Tangent(%f°): %.4f%n", angle, results[2]);
        }

        sc.close();
    }
}    
