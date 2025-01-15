import java.util.Scanner;

public class ToggleCase {

    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
            if (Character.isUpperCase(ch)) {
                result.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.toUpperCase(ch));
            } else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        String toggledString = toggleCase(str);
        System.out.println("Toggled case string: " + toggledString);
        
        scanner.close();
    }
}
