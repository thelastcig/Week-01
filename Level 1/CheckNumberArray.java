import java.util.Scanner;
public class CheckNumberArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking input for the array
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

       
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                if (numbers[i] % 2 == 0) {
                    System.out.println(numbers[i] + " is positive and an even number.");
                } else {
                    System.out.println(numbers[i] + " is positive and an odd number.");
                }
            } else if (numbers[i] == 0) {
                System.out.println(numbers[i] + " is zero.");
            } else {
                System.out.println(numbers[i] + " is a negative number.");
            }
        }

        // Comparing the first and last elements
        if (numbers[0] == numbers[numbers.length - 1]) {
            System.out.println("The first and last elements are equal.");
        } else if (numbers[0] > numbers[numbers.length - 1]) {
            System.out.println("The first element is greater than the last element.");
        } else {
            System.out.println("The first element is less than the last element.");
        }

        sc.close();
    }
}