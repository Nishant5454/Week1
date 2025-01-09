import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        // Input value
        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter the base of the triangle in inches: ");
        double baseInInches = sc.nextDouble();

        System.out.print("Enter the height of the triangle in inches: ");
        double heightInInches = sc.nextDouble();

        // area in square inches
        double areaInSquareInches = 0.5 * baseInInches * heightInInches;

        // base and height from inches to centimeters
        double baseInCentimeters = baseInInches * 2.50;
        double heightInCentimeters = heightInInches * 2.50;

        //  area in square centimeters
        double areaInSquareCentimeters = 0.5 * baseInCentimeters * heightInCentimeters;

        // output; 
        System.out.println("Your Height in cm is"+" "+ heightInCentimeters+" "+"while in feet is"+" "+"and inche is"+" "+heightInInches);
    }
}