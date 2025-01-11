import java.util.Scanner;
public class CheckNumber {
    public String checkNum(int number){
        //checkin the number
        if(number>0){ 
            return number + " is positive."; 
        }else if(number == 0){
            return number + " is zero.";            
        }else{
            return number + " is negative.";
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        CheckNumber numCheck = new CheckNumber();
        System.out.println(numCheck.checkNum(number));

        sc.close();
    }
}
