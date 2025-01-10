import java.util.Scanner;
public class VotingAge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];

        for(int i = 0; i < ages.length; i++){
            System.out.println("Enter the age student " + (i+1));
            ages[i] = sc.nextInt();
        }
        // Check voting eligibility
        for(int i =0; i<ages.length; i++){
            if(ages[i] >= 18){
                System.out.println("The student with age " + ages[i] + " can vote.");
            }else if( 0 < ages[i] && ages[i] < 18){
                System.out.println("The student with age " + ages[i] + " cannot vote.");
            }else{
                System.out.println("Invalid age for student " + (i + 1) + ".");
            }
        sc.close();
        }
    }
}