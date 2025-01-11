import java.util.Scanner;
public class SpringSeason {
    //checking of spring season
    public boolean checkSpring(int month, int day){
        if ((month == 3 && day >= 20 && day <= 31) ||
            (month == 4 && day >= 1 && day <= 30) ||
            (month == 5 && day >= 1 && day <= 31) ||
            (month == 6 && day >= 1 && day <= 20)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month: ");
        int month = sc.nextInt();
        System.out.print("Enter the day: ");
        int day = sc.nextInt();

        SpringSeason checkSeason = new SpringSeason();
        System.out.println(checkSeason.checkSpring(month, day));
        sc.close();     

    }
      
}