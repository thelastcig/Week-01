import java.util.Scanner;
public class AtheleteRounds {

    public int numberOfRounds(int sideA, int sideB, int sideC){
        int perimeter = sideA +sideB +sideC;
        int distance = 5000; //5km = 5000 meters given in the question
        return distance/perimeter;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side a of the triangle: ");
        int sideA = sc.nextInt();
        System.out.print("Enter the side b of the triangle: ");
        int sideB = sc.nextInt();
        System.out.print("Enter the side c of the triangle: ");
        int sideC = sc.nextInt();

        AtheleteRounds rounds = new AtheleteRounds();
        System.out.println("Total number of rounds: " + rounds.numberOfRounds(sideA, sideB, sideC));
        sc.close();
    }
    
}
