import java.util.Scanner;

public class RoundsOfAthelete {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = sc.nextDouble();

        double perimeter = side1 + side2 + side3;

        // Total distance to be covered in meters (5 km = 5000 meters)
        double totalDistance = 5000;

        // Calculate the total number of rounds
        double rounds = totalDistance / perimeter;

        // Output the result
        System.out.printf("The total number of rounds the athlete will run is %.2f to complete 5 km.\n", rounds);

        sc.close();
    }
}

