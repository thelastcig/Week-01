import java.util.Scanner;

public class Vote {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person: ");
        int age = sc.nextInt(); //taking the age
        if(age >= 18){
            System.out.println("The person's age is " + age + " can vote");
        }else{
            System.out.println("The person's age is " + age + " cannot vote");
        }   
        sc.close();     
    }
    
}
