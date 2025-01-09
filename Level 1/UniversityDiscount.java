import java.util.Scanner;
public class UniversityDiscount {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fee: ");
        double fee = sc.nextDouble();        
        System.out.println("Enter the discount Percent: ");
        double discountPercent = sc.nextDouble();


        double discount = (fee*discountPercent)/100;

        double discountedPrice = fee - discount;

        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountedPrice);

    }
    
}
  

