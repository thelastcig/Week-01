import java.util.Scanner;

public class CollinearityChecker {

 
    public static boolean arePointsCollinearUsingSlope(double x1, double y1, double x2, double y2, double x3, double y3) {
       
        if ((x2 - x1 == 0) || (x3 - x2 == 0) || (x3 - x1 == 0)) {
            return (x2 - x1 == 0) && (x3 - x2 == 0);
        }
        
        double slopeAB = (y2 - y1) / (x2 - x1);
        double slopeBC = (y3 - y2) / (x3 - x2);
        double slopeAC = (y3 - y1) / (x3 - x1);

       
        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

   
    public static boolean arePointsCollinearUsingArea(double x1, double y1, double x2, double y2, double x3, double y3) {
      
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        
        return area == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter coordinates of the first point (x1, y1): ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Enter coordinates of the second point (x2, y2): ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Enter coordinates of the third point (x3, y3): ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

       
        boolean collinearSlope = arePointsCollinearUsingSlope(x1, y1, x2, y2, x3, y3);
        System.out.println("Are points collinear using slope formula? " + collinearSlope);

        boolean collinearArea = arePointsCollinearUsingArea(x1, y1, x2, y2, x3, y3);
        System.out.println("Are points collinear using area formula? " + collinearArea);

        scanner.close();
    }
}