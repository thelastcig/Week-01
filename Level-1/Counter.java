import java.util.Scanner;

public class Counter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the counter : ");
        int count = sc.nextInt(); //enter the counter
        
        while(count >= 1){
            System.out.println(count);
            count--;
            
        }
        sc.close();
        System.out.println("Rocket launched");        

    }   
}