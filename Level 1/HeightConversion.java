import java.util.Scanner;
public class HeightConversion {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in cm: ");
        double heightInCM = sc.nextFloat();

        double heightInInch = heightInCM/2.54; //1 inch = 2.54 cm
        double heightInFoot = heightInInch/12; //1 foot = 12 inches
        System.out.printf("Your Height in cm is %.2f while in feet is %.2f and inches is %.2f",heightInCM, heightInFoot, heightInInch);
        sc.close();
    }
    
}
