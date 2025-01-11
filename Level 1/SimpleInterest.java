import java.util.Scanner;

public class SimpleInterest{
    public double calculateInterest(double principal, double time, double rate){
        return (principal*rate*time)/100;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter the time: ");
        double time = sc.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = sc.nextDouble();

        SimpleInterest calculateSI = new SimpleInterest();
        System.out.println("The Simple Inetrest is: " + calculateSI.calculateInterest(principal, time, rate));

        sc.close();
    }
}