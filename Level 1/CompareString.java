import java.util.Scanner;

public class CompareString{

    public boolean compareStr(String word1, String word2){
        if(word1.length() != word2.length()){
            return false;
        }
        
        for(int i =0; i<word1.length(); i++){
            if(word1.charAt(i) != word2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String word1 = sc.next();
        System.out.print("Enter String 2: ");
        String word2 = sc.next();
        boolean answer = word1.equals(word2);
        CompareString compare = new CompareString();
        System.out.println(compare.compareStr(word1, word2));
        if(compare.compareStr(word1, word2) == answer){
            System.out.println("Both methods give the same result.");

        }else{
            System.out.println("Methods give different results.");
        }
      
        
    }
}