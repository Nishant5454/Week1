import java.util.Scanner;

class Stringequals{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); 
    System.out.println("Enter first String"); 
    String s1=sc.nextLine(); 
    System.out.println("Enter the second String"); 
    String s2=sc.nextLine();  // user input using the  Scanner next() method for 2 String variables
    if(s1.equals(s2)){//String Built-In method to check if the results are the same and display the result 

        System.out.println("They are equal");
    }
    else{
        System.out.println("They are not equal");
    }
    sc.close();

        
    }

    

}