import java.util.Scanner;

public class YardsAndMiles{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        
        final int feetPerYard = 3; // 1 yard = 3 feet
        final int yardsPerMile = 1760; // 1 mile = 1760 yards

        // Take user input for distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();

        // Convert feet to yards
        double distanceInYards = distanceInFeet / feetPerYard;

        // Convert yards to miles
        double distanceInMiles = distanceInYards / yardsPerMile;

    
        System.out.println("The distance is:");
        System.out.println(distanceInYards + " yards");
        System.out.println(distanceInMiles + " miles");

   
        input.close();
    }

}