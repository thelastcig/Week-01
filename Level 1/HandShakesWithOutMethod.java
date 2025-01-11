import java.util.Scanner;

public class HandShakesWithOutMethod {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Students: ");
        int numberOfStudents = sc.nextInt(); //total number of students
        int maxHandShake = (numberOfStudents*(numberOfStudents - 1))/2;
        System.out.println("Maximum Handshake: " + maxHandShake);
        sc.close();
    }
    
    
}
