import java.util.Scanner;
public class YoungestAndTallest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the age of Amar: ");
        int ageAmar = sc.nextInt();
        System.out.print("Enter the age of Akbar: ");
        int ageAkbar = sc.nextInt();
        System.out.print("Enter the age of Anthony: ");
        int ageAnthony = sc.nextInt();

      
        System.out.print("Enter the height of Amar (in cm): ");
        double heightAmar = sc.nextDouble();
        System.out.print("Enter the height of Akbar (in cm): ");
        double heightAkbar = sc.nextDouble();
        System.out.print("Enter the height of Anthony (in cm): ");
        double heightAnthony = sc.nextDouble();

       
        String youngestFriend;
        int youngestAge = ageAmar;
        youngestFriend = "Amar";

        if (ageAkbar < youngestAge) {
            youngestAge = ageAkbar;
            youngestFriend = "Akbar";
        }
        if (ageAnthony < youngestAge) {
            youngestAge = ageAnthony;
            youngestFriend = "Anthony";
        }

        
        String tallestFriend;
        double tallestHeight = heightAmar;
        tallestFriend = "Amar";

        if (heightAkbar > tallestHeight) {
            tallestHeight = heightAkbar;
            tallestFriend = "Akbar";
        }
        if (heightAnthony > tallestHeight) {
            tallestHeight = heightAnthony;
            tallestFriend = "Anthony";
        }

       
        System.out.println("The youngest friend is: " + youngestFriend + " with age " + youngestAge + " years.");
        System.out.println("The tallest friend is: " + tallestFriend + " with height " + tallestHeight + " cm.");

        sc.close(); 
    }
}