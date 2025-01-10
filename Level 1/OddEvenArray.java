import java.util.Scanner;
public class OddEvenArray {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a range number: ");
        int range = sc.nextInt();
        int size = (range/2)+1;
        int[] odd = new int[size];
        int[] even = new int[size];
        int oddIndex = 0;
        int evenIndex = 0;

        // Check if the number is natural (greater than 0)
        if (range <= 0) {
            System.out.println("Please enter a natural number.");
            sc.close();
            return;
        }

        for(int i = 1; i <= range; i++){
            if(i % 2 == 0){
                even[evenIndex] = i;
                evenIndex++;
            }else{
                odd[oddIndex] = i;
                oddIndex++;
            }
        }
        System.out.println("odd numbers: ");
        for(int i = 0; i < odd.length; i++){
            System.out.print(odd[i] +" ");
        }
        System.out.println("\neven numbers: ");
        for(int i = 0; i < even.length; i++){
            System.out.print(even[i] +" ");
        }
        sc.close();
    }
    
}
