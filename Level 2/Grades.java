import java.util.Scanner;

public class Grades {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks in Maths: ");
        double maths = sc.nextDouble();
        System.out.print("Enter the marks in Physics: ");
        double physics = sc.nextDouble();
        System.out.print("Enter the marks in Chemistry: ");
        double chemistry = sc.nextDouble();

        double percentage = ((maths + physics + chemistry) / 300) * 100;

        if(percentage >= 80){
            System.out.println("Level 4, above agency-normalized standards");
        }else if(percentage >=70 && percentage <= 79){
            System.out.println("Level 3, at agency-normalized standards");
        }else if(percentage >=60 && percentage <= 69){
            System.out.println("Level 2, below, but appproaching agency-normalized standards");
        }else if(percentage >=50 && percentage <= 59){
            System.out.println("Level 1, well below agency-normalized standards");
        }else if(percentage >=40 && percentage <= 49){
            System.out.println("Level 1, too below agency-normalized standards");
        }else{
            System.out.println("Remedial Standards");
        }

    }
    
}
