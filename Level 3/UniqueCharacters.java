import java.util.Scanner;

public class UniqueCharacters {

   
    public static int calculateLength(String text) {
        int length = 0;
        try {
            while (true) {
                text.charAt(length);
                length++;
            }
        } catch (IndexOutOfBoundsException e) {
            
        }
        return length;
    }

    
    public static char[] findUniqueCharacters(String text) {
        int length = calculateLength(text);
        char[] tempUnique = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (tempUnique[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }


            if (isUnique) {
                tempUnique[uniqueCount++] = currentChar;
            }
        }

        
        char[] uniqueCharacters = new char[uniqueCount];
        System.arraycopy(tempUnique, 0, uniqueCharacters, 0, uniqueCount);

        return uniqueCharacters;
    }

   
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter a string: ");
        String input = scanner.nextLine();


        char[] uniqueCharacters = findUniqueCharacters(input);

        System.out.println("Unique characters in the string:");
        for (char ch : uniqueCharacters) {
            System.out.print(ch + " ");
        }

        scanner.close();
    }
}