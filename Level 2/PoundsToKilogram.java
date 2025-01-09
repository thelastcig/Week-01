import java.util.Scanner;

public class PoundsToKilogram {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter weight in pounds: ");
        double pounds = sc.nextDouble(); //input weight in pound

        System.out.println("The weight of the person in pound is " + pounds + " and in kg is " +  (pounds/2.2));
    }
    
}