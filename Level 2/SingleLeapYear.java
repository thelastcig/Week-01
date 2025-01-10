import java.util.*;
public class SingleLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a year to check if it is a leap year: ");
        int year = sc.nextInt();

        
        if ((year >= 1582) && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) { // Single if condition using logical AND (&&) and OR (||) operators
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close(); 
    }
    
}
