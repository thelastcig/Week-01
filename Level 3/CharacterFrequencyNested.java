import java.util.Scanner;

public class CharacterFrequencyNested {

    
    public static String[] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();
        int[] frequency = new int[characters.length];

       
        for (int i = 0; i < characters.length; i++) {
            frequency[i] = -1;
        }

        for (int i = 0; i < characters.length; i++) {
            if (frequency[i] == 0) continue; 

            int count = 1; 
            for (int j = i + 1; j < characters.length; j++) {
                if (characters[i] == characters[j]) {
                    count++;
                    frequency[j] = 0; 
                }
            }
            frequency[i] = count; 
        }

       
        int uniqueCount = 0;
        for (int freq : frequency) {
            if (freq > 0) {
                uniqueCount++;
            }
        }

        
        String[] result = new String[uniqueCount];
        int index = 0;

        for (int i = 0; i < characters.length; i++) {
            if (frequency[i] > 0) {
                result[index++] = characters[i] + " : " + frequency[i];
            }
        }

        return result;
    }

    
    public static void displayCharacterFrequency(String[] frequencies) {
        System.out.println("Character Frequencies:");
        for (String freq : frequencies) {
            System.out.println(freq);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        
        String[] charFrequencies = findCharacterFrequency(input);

       
        displayCharacterFrequency(charFrequencies);

        scanner.close();
    }
}
