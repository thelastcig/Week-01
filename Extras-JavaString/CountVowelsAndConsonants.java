import java.util.Scanner;

public class CountVowelsAndConsonants {

    public static void countVowelsAndConsonants(String str) {
        int vowelCount = 0, consonantCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch)) {
                if ("AEIOUaeiou".indexOf(ch) != -1) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }
        
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        countVowelsAndConsonants(input);
        
        scanner.close();
    }
}
