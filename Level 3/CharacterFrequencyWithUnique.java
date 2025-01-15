import java.util.Scanner;

public class CharacterFrequencyWithUnique {

    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        String uniqueString = "";

        
        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            
            for (int j = 0; j < uniqueString.length(); j++) {
                if (uniqueString.charAt(j) == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            
            if (isUnique) {
                uniqueString += currentChar;
            }
        }

       
        return uniqueString.toCharArray();
    }

   
    public static String[][] findCharacterFrequency(String text) {
        char[] uniqueChars = findUniqueCharacters(text);
        int length = uniqueChars.length;

       
        String[][] charFrequency = new String[length][2];

        for (int i = 0; i < length; i++) {
            char currentChar = uniqueChars[i];
            int frequency = 0;

            
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    frequency++;
                }
            }

            
            charFrequency[i][0] = Character.toString(currentChar);
            charFrequency[i][1] = Integer.toString(frequency);
        }

        return charFrequency;
    }

   
    public static void displayCharacterFrequency(String[][] charFrequency) {
        System.out.printf("%-10s %-10s%n", "Character", "Frequency");
        System.out.println("---------------------");
        for (String[] row : charFrequency) {
            System.out.printf("%-10s %-10s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        String[][] charFrequency = findCharacterFrequency(input);

        
        System.out.println("Character Frequencies:");
        displayCharacterFrequency(charFrequency);

        scanner.close();
    }
}
