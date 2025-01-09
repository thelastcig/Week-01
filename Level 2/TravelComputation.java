import java.util.Scanner;

public class TravelComputation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user inputs for name and cities
        System.out.print("Enter the name of the traveler: ");
        String name = sc.nextLine();

        System.out.print("Enter the starting city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter the city you will travel via: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter the final destination city: ");
        String toCity = sc.nextLine();

        // Taking user inputs for distances
        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " (in miles): ");
        double distanceFromToVia = sc.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " (in miles): ");
        double distanceViaToFinalCity = sc.nextDouble();

        // Taking user inputs for time taken
        System.out.print("Enter the time taken from " + fromCity + " to " + viaCity + " (in minutes): ");
        int timeFromToVia = sc.nextInt();

        System.out.print("Enter the time taken from " + viaCity + " to " + toCity + " (in minutes): ");
        int timeViaToFinalCity = sc.nextInt();

        // Calculating total distance and total time
        double totalDistance = distanceFromToVia + distanceViaToFinalCity;
        int totalTime = timeFromToVia + timeViaToFinalCity;

        // Printing the travel details
        System.out.println("\nThe Total Distance travelled by " + name + " from " + 
                           fromCity + " to " + toCity + " via " + viaCity +
                           " is " + totalDistance + " miles and " +
                           "the Total Time taken is " + totalTime + " minutes");

        sc.close();
    }
   
}