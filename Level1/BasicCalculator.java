
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        // Input for num1
        System.out.print("Enter the first number ");
        double number1 = sc.nextDouble();

        System.out.print("Enter the second number ");
        double number2 = sc.nextDouble();

        // Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = (number1/number2);       // Print the results
        System.out.println("The addition, subtraction, multiplication, and division values of two numbers is "+" "+number1+" "+number2+" "+"is"+" "+addition+" "+subtraction+" "+multiplication+" "+division);
    }
}