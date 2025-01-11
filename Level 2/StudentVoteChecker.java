import java.util.Scanner;

public class StudentVoteChecker {
    public boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age, cannot vote
        }
        return age >= 18; // Can vote if age is 18 or above
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        StudentVoteChecker checker = new StudentVoteChecker();

        System.out.println("Enter the age of 10 students:");

        for (int i = 0; i < ages.length; i++) {
            System.out.print("Age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            boolean canVote = checker.canStudentVote(ages[i]);
            if (ages[i] < 0) {
                System.out.println("Invalid age entered.");
            } else if (canVote) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }

        sc.close();
    }
}