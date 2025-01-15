import java.util.Scanner;

public class VowelConsonantChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine(); 
        sc.close();

        
        String[][] charAnalysis = analyzeCharacters(input);

        
        displayCharacterAnalysis(charAnalysis);
    }

    
    public static String checkVowelOrConsonant(char c) {
        char lower = (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c; 

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

    
    public static String[][] analyzeCharacters(String text) {
        String[][] charAnalysis = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            charAnalysis[i][0] = String.valueOf(currentChar); 
            charAnalysis[i][1] = checkVowelOrConsonant(currentChar);
        }

        return charAnalysis;
    }

    
    public static void displayCharacterAnalysis(String[][] charAnalysis) {
        System.out.println("\nCharacter Analysis:");
        System.out.println("-----------------------------");
        System.out.println("Character\tType");
        System.out.println("-----------------------------");
        for (String[] row : charAnalysis) {
            System.out.println(row[0] + "\t\t" + row[1]);
        }
        System.out.println("-----------------------------");
    }
}
