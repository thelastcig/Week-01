import java.util.Scanner;

public class TextSplitter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine(); 
        sc.close();

        
        String[] customSplitWords = splitTextWithoutSplitMethod(input);

        String[] builtInSplitWords = input.split(" ");

       
        boolean areEqual = compareWordArrays(customSplitWords, builtInSplitWords);

       
        System.out.println("Words using user-defined method:");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method:");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nAre the results equal? " + areEqual);
    }

    
    public static String[] splitTextWithoutSplitMethod(String text) {
        int wordCount = countWords(text);
        int[] spaceIndexes = new int[wordCount + 1];
        int index = 0, spaceIndex = 0;

        try {
            while (true) {
                if (text.charAt(index) == ' ') {
                    spaceIndexes[spaceIndex++] = index;
                }
                index++;
            }
        } catch (IndexOutOfBoundsException e) {
            spaceIndexes[spaceIndex] = index;
        }

        
        String[] words = new String[wordCount];
        int start = 0;
        for (int i = 0; i < wordCount; i++) {
            int end = spaceIndexes[i];
            words[i] = text.substring(start, end);
            start = end + 1; 
        }
        return words;
    }

   
    public static int countWords(String text) {
        int count = 0, index = 0;
        boolean inWord = false;
        try {
            while (true) {
                if (text.charAt(index) != ' ' && !inWord) {
                    count++;
                    inWord = true;
                } else if (text.charAt(index) == ' ') {
                    inWord = false;
                }
                index++;
            }
        } catch (IndexOutOfBoundsException e) {
        
        }
        return count;
    }

    
    public static boolean compareWordArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
