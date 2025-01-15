import java.util.Scanner;

public class CharacterFrequency {

    
    public static String[][] findCharacterFrequency(String text) {
        int[] frequency = new int[256]; 
        
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            frequency[currentChar]++;
        }

      
        int uniqueCharCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCharCount++;
            }
        }

        
        String[][] charFrequency = new String[uniqueCharCount][2];
        int index = 0;

        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                charFrequency[index][0] = Character.toString((char) i); // Convert ASCII to character
                charFrequency[index][1] = Integer.toString(frequency[i]); // Store frequency
                index++;
            }
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
