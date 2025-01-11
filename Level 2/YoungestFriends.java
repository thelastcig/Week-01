import java.util.Scanner;

public class YoungestFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        int[] ages = new int[3];
        double[] heights = new double[3];
        String[] names = {"Amar", "Akbar", "Anthony"};


        System.out.println("Enter the age and height of Amar:");
        ages[0] = scanner.nextInt();
        heights[0] = scanner.nextDouble();

        System.out.println("Enter the age and height of Akbar:");
        ages[1] = scanner.nextInt();
        heights[1] = scanner.nextDouble();

        System.out.println("Enter the age and height of Anthony:");
        ages[2] = scanner.nextInt();
        heights[2] = scanner.nextDouble();

        String youngest = findYoungest(names, ages);
        System.out.println("The youngest friend is: " + youngest);

      
        String tallest = findTallest(names, heights);
        System.out.println("The tallest friend is: " + tallest);

        scanner.close();
    }

    public static String findYoungest(String[] names, int[] ages) {
        int minAgeIndex = 0;
        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < ages[minAgeIndex]) {
                minAgeIndex = i;
            }
        }
        return names[minAgeIndex];
    }

   
    public static String findTallest(String[] names, double[] heights) {
        int maxHeightIndex = 0;
        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > heights[maxHeightIndex]) {
                maxHeightIndex = i;
            }
        }
        return names[maxHeightIndex];
    }
}
