import java.util.Scanner;

public class SumOfNaturalNum {
    public int sumNatural(int number){
        if(number < 0){
            return 0;
        }else{
            int sum = number * (number+1)/2;
            return sum;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt();

        SumOfNaturalNum sumNum = new SumOfNaturalNum();
        System.out.println("The sum of " + number + " is " + sumNum.sumNatural(number));
        sc.close();  
    }
    
}
