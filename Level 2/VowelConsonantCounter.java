import java.util.Scanner;

public class VowelConsonantCounter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine(); 
        sc.close();

       
        int[] counts = countVowelsAndConsonants(input);

   
        System.out.println("\nAnalysis of the string:");
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);
    }

    
    public static String checkVowelOrConsonant(char c) {
        char lower = (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c; // Convert to lowercase if uppercase

        if (lower >= 'a' && lower <= 'z') { 
            if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                return "Vowel";
            } else {
                return "Consonant";
            }
        } else {
            return "Not a Letter";
        }
    }

   
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            String result = checkVowelOrConsonant(currentChar);

            if (result.equals("Vowel")) {
                vowels++;
            } else if (result.equals("Consonant")) {
                consonants++;
            }
        }

        return new int[]{vowels, consonants}; 
    }
}
