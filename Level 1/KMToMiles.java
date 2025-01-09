import java.util.Scanner;
public class KMToMiles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in Kilo Metre: ");
        double km = sc.nextDouble(); //To input distance Kilo Metre
        double convertToMiles = km/1.6; //1.6  is the conversion factor
        System.out.println("The total miles is " + convertToMiles + " miles for the given " + km + " kilometers.");
        sc.close();

    }
    
}