
import java.util.Scanner;

public class TemperatureConversionFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = scanner.nextDouble();
        double celsius = (fahrenheit - 32) * 5/9; // calculating celsius
		System.out.print("The "+fahrenheit+" fahrenheit is "+celsius+" celsius");
        scanner.close();
    }
}
