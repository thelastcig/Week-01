import java.time.LocalDate;
import java.util.Scanner;
//Takes a date input and adds 7 days, 1 month, and 2 years to it.
//Then subtracts 3 weeks from the result.
public class DateArithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        
        LocalDate date = LocalDate.parse(inputDate);
        
        LocalDate result = date.plusDays(7).plusMonths(1).plusYears(2).minusWeeks(3);
        
        System.out.println("Resulting date: " + result);
        
        scanner.close();
    }
}
