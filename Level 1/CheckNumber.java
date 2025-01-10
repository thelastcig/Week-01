import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        int number = sc.nextInt();
        if(number > 0){  //check for positve
            System.out.println("Positive");            
        }else if(number == 0){  //check for zero
            System.out.println("Zero");
        }else{               //check for negative
            System.out.println("Negative");
        }
        sc.close();

    }
    
}
