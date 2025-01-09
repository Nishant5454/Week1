import java.util.Scanner;

public class UniversityFee2 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        // Take user input for fee
        System.out.print("Enter the student fee: ");
        double fee = scanner.nextDouble();

        // Take the Discount percentage
        System.out.print("Enter the  discount percentage : ");
        double discountPercent = scanner.nextDouble();

        // Total Discount amount
        double discount = (fee * discountPercent) / 100;

        // Total fee that a student have to pay to the univesity
        double finalFee = fee - discount;

        // Print the result
        System.out.printf("The discount amount is INR"+discount+"and final discount fee is INR"+finalFee);
    }
}
