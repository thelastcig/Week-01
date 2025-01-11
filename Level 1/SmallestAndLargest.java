import java.util.Scanner;
public class SmallestAndLargest {
    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int maximum = Math.max(Math.max(number1, number2), number3);
        int minimum = Math.min(Math.min(number1, number2), number3);

        return new int[]{minimum, maximum};    //smallest at 0 and largest at 1   

        }


        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter num1: ");
            int number1 = sc.nextInt();
            System.out.println("Enter num2: ");
            int number2 = sc.nextInt();
            System.out.println("Enter num3: ");
            int number3 = sc.nextInt();

            int[] result = findSmallestAndLargest(number1, number2, number3);
            System.out.println("Smallest Number: " + result[0]);
            System.out.println("Largest Number: " + result[1]);
            sc.close();
        }

}      