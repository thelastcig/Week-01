import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Number of Chocolates: ");
        int numofChocolates = sc.nextInt();
        System.out.println("Number of Children: ");
        int numofChildren = sc.nextInt();

        int chocolatePerChildren = numofChocolates / numofChildren;

        int remainingChocolates = numofChocolates % numofChildren;

        System.out.println("The number of chocolates each child gets is " + chocolatePerChildren + " and the number of remaining chocolates are " + remainingChocolates);

    }

   
}
