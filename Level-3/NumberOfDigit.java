import java.util.Scanner;
public class NumberOfDigit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int temp = number;
        int count = 0;
        while(temp != 0){
            temp = temp/10;
            count++;
        }
        System.out.println("The number of digits in " + number + " is " + count);
        sc.close();
    }
    
}