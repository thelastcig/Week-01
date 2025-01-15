import java.util.Scanner;

public class CompareArray {
    public char[] charArray(String word){
        char[]  temp = new char[word.length()];
        for(int i = 0; i<word.length(); i++){
            temp[i] = word.charAt(i);
        }
        return temp;
    }

    public boolean compareCharArray(char[] array1, char[] array2){
        if(array1.length != array2.length){
            return false;
        }else{
            for(int i = 0; i<array1.length;i++){
                if(array1[i] != array2[i]){
                    return false;
                }
            }
        return true;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.next();

        compareArray userCompare = new compareArray();
        char[] result = userCompare.charArray(word);
        char[] inbuiltMethod = word.toCharArray();
        
        boolean areEqual = userCompare.compareCharArray(result, inbuiltMethod);

        System.out.println("Character using custom method: " + new String(result));
        System.out.println("Characters using built-in toCharArray(): " + new String(inbuiltMethod));
        System.out.println("Do both methods produce the same result? " + areEqual);
    }
    
}
