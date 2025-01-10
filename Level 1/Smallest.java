import java.util.Scanner;
public class Smallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter num3: ");
        int num3 = sc.nextInt();

        if(num1<num2 && num1 < num3){        //to determine if num1 is the smallest
            System.out.println(num1 + " is the smallest.");
        }else if(num2<num1 && num2 < num3){     //to determine if num2 is the smallest
            System.out.println(num2 + " is the smallest.");
        }else{                              //to determine if num3 is the smallest
            System.out.println(num3 + " is the smallest.");
        }
    }  
}