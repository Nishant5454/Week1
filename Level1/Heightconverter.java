import java.util.Scanner;

public class Heightconverter {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        // input for height in centimeters
        System.out.print("Enter your height in centimeters: ");
        double heightInCm = sc.nextDouble();

        //  height from centimeters to inches
        double heightInInches = heightInCm / 2.54;

        // Calculate feet and remaining inches
        int feet = (int) heightInInches / 12;
        int inches = (int) heightInInches % 12;

        //  result
        System.out.printf("Your Height in cm is"+heightInCm+" " +"height in feet is"+" "+feet+" " +"height in inches is"+inches);
    }
}
