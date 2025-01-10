import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //store employee data
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        
        double totalOldSalary = 0;
        double totalBonus = 0;
        double totalNewSalary = 0;

        // Input loop for salaries and years of service
        for (int i = 0; i < 10; i++) {
            while (true) {
                try {
                    System.out.println("Enter salary for employee " + (i + 1) + ": ");
                    salaries[i] = scanner.nextDouble();
                    if (salaries[i] <= 0) {
                        System.out.println("Invalid salary. Please enter a positive value.");
                        continue;
                    }

                    System.out.println("Enter years of service for employee " + (i + 1) + ": ");
                    yearsOfService[i] = scanner.nextDouble();
                    if (yearsOfService[i] < 0) {
                        System.out.println("Invalid years of service. Please enter a non-negative value.");
                        continue;
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Invalid input. Please enter numeric values.");
                    scanner.next(); // Clear invalid input
                }
            }
        }

        // Bonus calculation loop
        for (int i = 0; i < 10; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];

           
            totalOldSalary += salaries[i];
            totalBonus += bonuses[i];
            totalNewSalary += newSalaries[i];
        }

        
        System.out.println("\nSummary of Bonus and Salary Adjustments:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Employee %d: Old Salary = %.2f, Bonus = %.2f, New Salary = %.2f%n",
                              i + 1, salaries[i], bonuses[i], newSalaries[i]);
        }
        System.out.printf("\nTotal Old Salary: %.2f%n", totalOldSalary);
        System.out.printf("Total Bonus: %.2f%n", totalBonus);
        System.out.printf("Total New Salary: %.2f%n", totalNewSalary);

        scanner.close();
    }
}  

