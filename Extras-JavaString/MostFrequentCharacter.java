import java.util.Scanner;

public class MostFrequentCharacter {

    public static char findMostFrequentCharacter(String str) {
        int[] freq = new int[256];
        
        for (int i = 0; i < str.length(); i++) {
            freq[str.charAt(i)]++;
        }
        
        int maxCount = 0;
        char mostFrequentChar = str.charAt(0);
        
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (freq[currentChar] > maxCount) {
                maxCount = freq[currentChar];
                mostFrequentChar = currentChar;
            }
        }
        
        return mostFrequentChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        char result = findMostFrequentCharacter(str);
        System.out.println("Most Frequent Character: '" + result + "'");
        
        scanner.close();
    }
}
