
/*
Write a program to generate a six-digit OTP number using Math.random() method. Validate the numbers are unique by generating the OTP number 10 times and ensuring all the 10 OTPs are not the same
Hint => 
*/
import java.util.Scanner;
public class GenerateOtp{
	//Write a method to Generate a 6-digit OTP number using Math.random() 
	public static int generate(){
        return (int)(Math.random() * 899999) + 100000;
	}
	public static boolean checkOtpUniqueness(int[] random){
		for (int i=0; i<10;i++) {
			for (int j=0 ; j<10;j++) {
				if(random[i]==random[j])
					return false;
			}
		}
		return true;
	}
	public static void main(String[] args){
		//Create an array to save the OTP numbers generated 10 times
		int[] random = new int[10];
        for (int i=0;i<10 ;i++ ) {
        	random[i] = generate();
        }
		System.out.print(generate());
		//Write a method to ensure that the OTP numbers generated are unique. If unique return true else return false
		if(checkOtpUniqueness()){
			System.out.print("generated numbers are unique");
		}else{
			System.out.print("generated numbers are not unique");
		}
	}
}
