import java.util.Scanner;

public class Bonus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of years of service: ");
        int yearsOfService = sc.nextInt();
        System.out.print("Enter the salary: ");
        double salary = sc.nextDouble();
        double bonus = 0;
        if(yearsOfService>5){
            bonus = salary * 0.05; // 5% bonus
                        
        }
        System.out.println("The bonus amount is: " + bonus);
        sc.close();

    }
    
    
}
