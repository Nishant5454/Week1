
import java.util.Scanner;// scanner class from util pkg

public class kmtoMiles {
    public static void main(String[] args) {
        System.out.println("Enter the value of distance in km");
        Scanner sc=new Scanner(System.in);// Scanner class for takin the input value from user
        double kilometer=sc.nextDouble(); // kilometer value in Double
        double Miles=kilometer*1.6; // total miles
        System.out.println("The total value of Miles is"+" "+Miles+" "+"For the"+" "+kilometer+""+"Kilometer");
        
    }
    
}

