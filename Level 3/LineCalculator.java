import java.util.Scanner;

public class LineCalculator {

    
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; 

  
        if (x2 == x1) {
            throw new IllegalArgumentException("The line is vertical; slope is undefined.");
        }
        double m = (y2 - y1) / (x2 - x1);

       
        double b = y1 - m * x1;

        result[0] = m; 
        result[1] = b; 
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter x1, y1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2, y2: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

       
        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.printf("The Euclidean distance between the points is: %.2f\n", distance);

      
        try {
            double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
            System.out.printf("The equation of the line is: y = %.2fx + %.2f\n", lineEquation[0], lineEquation[1]);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
