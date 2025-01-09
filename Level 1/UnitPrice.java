import java.util.Scanner;
public class UnitPrice {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Unit Price of Item: "); 
        float unitPrice = sc.nextFloat(); //Unit price of the item
        System.out.println("Enter the quantity: ");
        int quantity = sc.nextInt(); //number of items
        System.out.println("The total purchase price is INR " + (unitPrice * quantity) + " if the quantity " + quantity + " and unit price is INR " + unitPrice);        
    }
    
}
