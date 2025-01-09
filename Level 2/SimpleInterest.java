import java.util.Scanner;
public class SimpleInterest {
    
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the princple: ");
    float p = sc.nextFloat();
    System.out.println("Enter the rate: ");
    float r = sc.nextFloat();
    System.out.println("Enter the time: ");
    float t = sc.nextFloat();

    float si = (p*r*t)/100;
    System.out.println("The Simple Interest is: " + si);
    sc.close();
    }


}
