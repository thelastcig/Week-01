import java.util.Scanner;
public class RemoveDuplicates {

    
    public static String removeDuplicates(String str) {
        
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }

        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.next();

       
        String modifiedString = removeDuplicates(input);
        System.out.println("Original String: " + input);
        System.out.println("Modified String: " + modifiedString);
    }
}
