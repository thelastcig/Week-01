import java.util.Scanner;

public class CalendarDisplay {

    
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1];
    }

  
    public static int getDaysInMonth(int month, int year) {
        int[] days = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

      
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return days[month - 1];
    }

   
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    
    public static int getFirstDayOfMonth(int month, int year) {
        int y = year;
        int m = month;
        int d = 1;

        y -= (14 - m) / 12;
        int x = y + y / 4 - y / 100 + y / 400;
        m += 12 * ((14 - m) / 12) - 2;
        int dayOfWeek = (d + x + (31 * m) / 12) % 7;

        return dayOfWeek; 
    }


    public static void displayCalendar(int month, int year) {
        String monthName = getMonthName(month);
        int daysInMonth = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);

        
        System.out.printf("\n  %s %d\n", monthName, year);
        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");

        
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

       
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%4d", day);

            
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        
        displayCalendar(month, year);

        scanner.close();
    }
}
