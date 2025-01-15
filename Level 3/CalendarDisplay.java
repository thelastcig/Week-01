import java.util.Scanner;

public class CalendarDisplay {
    
    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June", 
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

    // Method to check if it's a leap year
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        }
        return false;
    }

    // Method to get the number of days in a month
    public static int getNumberOfDays(int month, int year) {
        int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        
        return daysInMonths[month - 1];
    }

    // Method to calculate the first day of the month using the Gregorian Calendar formula
    public static int getFirstDayOfMonth(int month, int year) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (x + 31 * m0 / 12) % 7;
    }

    // Method to print the calendar for a given month and year
    public static void printCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int numOfDays = getNumberOfDays(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        // Print the calendar heading
        System.out.println("\n" + monthName + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Print initial spaces for the first day
        int currentDay = 1;
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // 4 spaces for alignment
        }

        // Print the days of the month
        for (int i = firstDay; currentDay <= numOfDays; i++) {
            System.out.printf("%3d ", currentDay);
            if (++i > 6) {
                i = 0;
                System.out.println();
            }
            currentDay++;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input for month and year
        System.out.print("Enter the month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        // Print the calendar for the given month and year
        printCalendar(month, year);

        scanner.close();
    }
}
