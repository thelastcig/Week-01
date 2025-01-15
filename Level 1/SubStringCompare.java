import java.util.Scanner;

public class SubStringCompare {
    public String compareSubString(String word, int begin, int last){
        String subString = "";
        for(int i = begin; i<last; i++){
            subString = subString + word.charAt(i);
        }
        return subString;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the word: ");
        String word = sc.next();
        System.out.print("Enter the Stating Index: ");
        int begin = sc.nextInt();
        System.out.print("Enter the last Index: ");
        int last = sc.nextInt();

        SubStringCompare compare = new SubStringCompare();
        String answerString  = word.substring(begin, last);
        String result = compare.compareSubString(word, begin, last);
        System.out.println("Result of charAt method: " + result);
        System.out.println("Result of in-built method: " + answerString);
        if(result.equals(answerString)){
            System.out.println("Both methods give the same result.");  
        }else{
            System.out.println("Methods give different results.");
        }
    }

    
}
