import java.util.Scanner;

public class CheckDivisibility{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check divisibilty: ");
        int div = sc.nextInt(); //take integer input to check
        if(div % 5 == 0){
            System.out.println(div + " is divisible by 5"); //check divisibilty using modulus
        }else{
            System.out.println(div + " is not divisible by 5");
        }
        sc.close();

    }
}