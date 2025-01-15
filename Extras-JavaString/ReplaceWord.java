import java.util.Scanner;

public class ReplaceWord {

    public static String replaceWord(String sentence, String target, String replacement) {
        return sentence.replace(target, replacement);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        
        System.out.print("Enter the word to replace: ");
        String target = scanner.nextLine();
        
        System.out.print("Enter the replacement word: ");
        String replacement = scanner.nextLine();
        
        String modifiedSentence = replaceWord(sentence, target, replacement);
        System.out.println("Modified Sentence: " + modifiedSentence);
        
        scanner.close();
    }
}
