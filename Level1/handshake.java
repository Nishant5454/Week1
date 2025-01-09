import java.util.Scanner;
class handshake{
	public static void main(String[]args){
	        Scanner sc=new Scanner(System.in);   // for the input 	
		System.out.println("Enter the number of student"); // input for the user
		int noOfStudents=sc.nextInt(); 
		int totalnumberofHandshake=(noOfStudents*(noOfStudents-1))/2;// logic implemented 
		System.out.print("The total no of Possible Handshakes are"+" "+totalnumberofHandshake);
	}
}
                		
