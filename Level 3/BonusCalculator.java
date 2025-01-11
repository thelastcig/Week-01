import java.util.Random;

public class BonusCalculator {

    
    public static int[][] generateEmployeeData(int numEmployees) {
        int[][] data = new int[numEmployees][2];
        Random random = new Random();

        for (int i = 0; i < numEmployees; i++) {
            
            data[i][0] = 10000 + random.nextInt(90000);

            
            data[i][1] = 1 + random.nextInt(10);
        }
        return data;
    }

   
    public static double[][] calculateBonusAndNewSalary(int[][] employeeData) {
        double[][] result = new double[employeeData.length][3];

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];

            double bonusPercentage = (yearsOfService > 5) ? 5.0 : 2.0;
            double bonus = oldSalary * (bonusPercentage / 100.0);
            double newSalary = oldSalary + bonus;

            result[i][0] = oldSalary;
            result[i][1] = bonus;
            result[i][2] = newSalary;
        }
        return result;
    }

   
    public static void displaySummary(int[][] employeeData, double[][] bonusData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        System.out.printf("%-10s %-15s %-15s %-15s %-15s%n", "Employee", "Old Salary", "Years of Service", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            int oldSalary = employeeData[i][0];
            int yearsOfService = employeeData[i][1];
            double bonus = bonusData[i][1];
            double newSalary = bonusData[i][2];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

            System.out.printf("%-10d %-15.2f %-15d %-15.2f %-15.2f%n",
                    i + 1, (double) oldSalary, yearsOfService, bonus, newSalary);
        }

        System.out.println("---------------------------------------------------------------------");
        System.out.printf("%-10s %-15.2f %-15s %-15.2f %-15.2f%n",
                "TOTAL", totalOldSalary, "-", totalBonus, totalNewSalary);
    }

    public static void main(String[] args) {
        int numEmployees = 10;


        int[][] employeeData = generateEmployeeData(numEmployees);

        
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);

        displaySummary(employeeData, bonusData);
    }
}
