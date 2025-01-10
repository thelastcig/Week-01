import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double[] heights = new double[11];
        double sumOfHeights = 0;

        for(int i = 0; i < heights.length; i++){
            System.out.print("Enter the height of player number " + (i + 1) + ": ");
            heights[i] = sc.nextDouble();        
        }
        for(int i = 0; i < heights.length; i++){
            sumOfHeights += heights[i]; //sum of player heights
        }
        double meanHeight = sumOfHeights/11; //calculating mean height
        System.out.printf("Mean height of the players: %.2f", meanHeight);
        sc.close();
    }
    
}
