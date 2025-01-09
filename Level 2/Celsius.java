import java.util.Scanner;

public class Celsius {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble(); //enter temp in fahrenheit
        
        double celsius = (fahrenheit - 32) * 5/9; //convert fahrenheit to celsius
        System.out.printf("The %.2f fahrenheit is %.2f celsius", fahrenheit, celsius);
    }
    
}
