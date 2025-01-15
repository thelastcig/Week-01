import java.util.Scanner;

public class StringTrimUsingCharAt {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string with leading and trailing spaces: ");
        String input = sc.nextLine();
        sc.close();


        int[] trimIndexes = findTrimIndexes(input);
        String trimmedString = customSubstring(input, trimIndexes[0], trimIndexes[1]);

      
        String builtInTrimmed = input.trim();

        
        boolean isEqual = compareStrings(trimmedString, builtInTrimmed);

        System.out.println("\nCustom Trimmed String: \"" + trimmedString + "\"");
        System.out.println("Built-in Trimmed String: \"" + builtInTrimmed + "\"");
        System.out.println("Are both results equal? " + isEqual);
    }

  
    public static int[] findTrimIndexes(String str) {
        int start = 0;
        int end = str.length() - 1;

       
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

       
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

   
    public static String customSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();

        for (int i = start; i <= end; i++) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

        return true;
    }
}
