import java.util.Scanner;;

public class MulitiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] table = new int[10];

        for(int i = 0; i<table.length; i++){
            table[i] = number * (i+1);
        }
        for(int i = 0; i < table.length; i++){ //calculating the table
            System.out.println(number + "x" + (i + 1) + " = " + table[i]);
        }

        sc.close();
    }
    
}
