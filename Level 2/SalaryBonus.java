import java.util.Scanner;
public class SalaryBonus {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Salary: ");
        int salary = sc.nextInt(); //salary input
        System.out.println("Enter the Bonus: ");
        int bonus = sc.nextInt(); //Bonus input

        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + " Hence Total Income is INR " + (salary + bonus));


    }

    
}
