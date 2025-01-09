import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);

        //  user input for the distance in feet
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = sc.nextDouble();

        // Convert distance from feet to yards
        double distanceInYards = distanceInFeet / 3;

        //  distance from yards to miles
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("Your height in cm is"+" "+distanceInFeet+" "+"while in feet is"+" "+distanceInFeet+" ");
    }
}