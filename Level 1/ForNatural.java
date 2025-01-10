import java.util.Scanner;

public class ForNatural {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        int formula =  number*(number+1)/2;
        int sum = 0;
        for(int i=1; i<=number; i++){
            sum += i;
            
        }

        System.out.println("Sum computed using the formula: " + formula);
        System.out.println("Sum computed using the while loop: " + sum);
        if(sum == formula){
            System.out.println("The results match! Both computations are correct.");
        }else{
            System.out.println("The results do not match. There might be an error in the calculations.");
        }
        sc.close();
    }
    
}
