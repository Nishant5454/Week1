
public class EmployeeBonus {

    // Method to generate a 2D array with random salaries and years of service
    public static int[][] generateSalariesAndYears(int numEmployees) {
        int[][] data = new int[numEmployees][2];
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = 10000 + (int) (Math.random() * 90000); // Random 5-digit salary
            data[i][1] = (int) (Math.random() * 10) + 1; // Random years of service (1 to 10)
        }
        return data;
    }

    // Method to calculate the new salary and bonus
    public static double[][] calculateNewSalariesAndBonuses(int[][] oldData) {
        double[][] newData = new double[oldData.length][2];
        for (int i = 0; i < oldData.length; i++) {
            int salary = oldData[i][0];
            int yearsOfService = oldData[i][1];
            double bonusPercentage=0.0; 
            if(yearsOfService>5){
                bonusPercentage=0.05;
            }
            else{
                bonusPercentage=0.02;
            
            }
            double bonus = salary * bonusPercentage;
            double newSalary = salary + bonus;
            newData[i][0] = newSalary;
            newData[i][1] = bonus;
        }
        return newData;
    }

    // Display the summary of the employee
    public static void displaySummary(int[][] oldData, double[][] newData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        for (int i = 0; i < oldData.length; i++) {
            int oldSalary = oldData[i][0];
            int yearsOfService = oldData[i][1];
            double newSalary = newData[i][0];
            double bonus = newData[i][1];

            totalOldSalary += oldSalary;
            totalNewSalary += newSalary;
            totalBonus += bonus;

           // System.out.println("oldSalary+ "oldSalary+"yearsOfService "+yearsOfService+" newSalary"+newSalary+"bonus"+bonus);
        } 
        //System.out.println("Total new Salary+ "totalNewSalary+"totalBonus "+totalBonus);
    }

    public static void main(String[] args) {
        int numEmployees = 10;

        // Generate random salaries and years of service
        int[][] oldValues = generateSalariesAndYears(numEmployees);

        
        double[][] newValues = calculateNewSalariesAndBonuses(oldValues);

        
        displaySummary(oldValues, newValues);
    }
}
