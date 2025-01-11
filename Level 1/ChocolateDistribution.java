import java.util.Scanner;

public class ChocolateDistribution {
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient = number / divisor;
        int remainder = number % divisor; 
        return new int[]{quotient, remainder};
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of chocolates:  ");
        int number = sc.nextInt();
        System.out.print("Enter the number of children: ");
        int divisor = sc.nextInt();

        int[] result = findRemainderAndQuotient(number, divisor);
        System.out.println("Number of chocolates per child: " + result[0]);
        System.out.println("Remaining chocolates: " + result[1]);
        sc.close();
    }
    
}
