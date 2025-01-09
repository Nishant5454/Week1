
import java.util.Scanner;

public class TemperatureConversionCelsius{
	public static void main (String[] args){
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter Temperature in celsius ");
		double celsius = scn.nextDouble();
		double fahrenheit = ((celsius*9)/5)+32 ; // calculating fahrenheit to celsius with formula  ((celsius*9)/5)+32 
		System.out.print("The "+celsius+" celsius is "+fahrenheit+" fahrenheit");
	}
}
