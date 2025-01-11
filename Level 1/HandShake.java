import java.util.Scanner;

public class HandShake {
    public int numberOfHandshake(int numberOfStudents){
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        HandShake nHandShake = new HandShake();
        System.out.println("Total number of HandShakes: " + nHandShake.numberOfHandshake(numberOfStudents));
        sc.close();
    }

}
