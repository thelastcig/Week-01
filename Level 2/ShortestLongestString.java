import java.util.Scanner;

public class ShortestLongestString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = sc.nextLine(); 
        sc.close();
        String[] words = splitTextWithoutSplitMethod(input);

       
        String[][] wordLengths = createWordLengthArray(words);

        String[] result = findShortestAndLongest(wordLengths);


        System.out.println("\nWord Analysis:");
        System.out.println("Shortest Word: " + result[0] + " (Length: " + result[1] + ")");
        System.out.println("Longest Word: " + result[2] + " (Length: " + result[3] + ")");
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

    
    public static int findLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
           
        }
        return count;
    }


    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findLengthWithoutLengthMethod(words[i])); // Store the length as String
        }
        return wordLengths;
    }

    
    public static String[] findShortestAndLongest(String[][] wordLengths) {
        String shortestWord = wordLengths[0][0];
        String longestWord = wordLengths[0][0];
        int shortestLength = Integer.parseInt(wordLengths[0][1]);
        int longestLength = Integer.parseInt(wordLengths[0][1]);

        for (String[] row : wordLengths) {
            int length = Integer.parseInt(row[1]);
            if (length < shortestLength) {
                shortestWord = row[0];
                shortestLength = length;
            }
            if (length > longestLength) {
                longestWord = row[0];
                longestLength = length;
            }
        }
        return new String[]{shortestWord, String.valueOf(shortestLength), longestWord, String.valueOf(longestLength)};
    }
}