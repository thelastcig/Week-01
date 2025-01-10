import java.util.Scanner;

public class ForLoopCounter {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the counter: ");
        int count = sc.nextInt(); //enter the counter
        for(int i= count; i>0; i--){ //declaring for loop
            System.out.println(i);

        }
        sc.close();
        System.out.println("Rocket launched!!!");
    }
    
}
