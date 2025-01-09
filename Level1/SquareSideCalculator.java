import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Take user input for the perimeter of the square
        System.out.print("Enter the perimeter of the square: ");
        double perimeter = sc.nextDouble();

        // Calculate the length of the side of the square
        double side = perimeter / 4;

        // Print the results
        System.out.printf("The length of the side is "+" "+side+""+"whose perimeter is"+" "+perimeter+" ");
                
    }
}