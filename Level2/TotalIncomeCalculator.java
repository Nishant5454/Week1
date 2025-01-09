
import java.util.Scanner;

public class TotalIncomeCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take salary input from user
        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        // Take bonus input from user
        System.out.print("Enter your bonus: ");
        double bonus = sc.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Print the result
        System.out.println("\nThe salary is INR " + salary + " and bonus is INR " + bonus + ".");
        System.out.println("Hence Total Income is INR " + totalIncome + " in Java");
    }
}
