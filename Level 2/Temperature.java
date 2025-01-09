import java.util.Scanner;

public class Temperature {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the temperature in Celsius: ");
        double celsius = sc.nextDouble(); //enter temp in celsius
        
        double fahrenheit = (celsius * 9/5) + 32; //convert Celsius to Farhenhiet
        System.out.printf("The %.2f Celsius is %.2f fahrenheit", celsius, fahrenheit);
    }
    
}
