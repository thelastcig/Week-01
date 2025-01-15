import java.util.Scanner;

public class CompareStrings {

    public static int compareStrings(String str1, String str2) {
        int length1 = str1.length();
        int length2 = str2.length();
        int minLength = Math.min(length1, length2);
        
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                return -1;
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return 1;
            }
        }
        
        if (length1 < length2) {
            return -1;
        } else if (length1 > length2) {
            return 1;
        }
        
        return 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter String 1: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter String 2: ");
        String str2 = scanner.nextLine();
        
        int result = compareStrings(str1, str2);
        
        if (result == 0) {
            System.out.println("\"" + str1 + "\" is equal to \"" + str2 + "\"");
        } else if (result < 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } else {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        }
        
        scanner.close();
    }
}
