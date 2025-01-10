import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check if it's Armstrong: ");
        int number = sc.nextInt(); //input for checking armstrong
        int temp = number;
        int sum = 0;
        while(temp != 0){
            int rem = temp % 10; //taking remainder
            sum = sum + (int)Math.pow(rem, 3);
            temp = temp /10;
        }
        if(sum == number){
            System.out.println(number + " is an Armstrong number");
        }else{
            System.out.println(number + " is not an Armstrong number");
        }
        sc.close();
    }
    
}
