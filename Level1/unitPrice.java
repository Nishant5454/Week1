import java.util.Scanner;

public class unitPrice {
    public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Unit Price");
	// Input price of the value
	int unitPrice=sc.nextInt();
        System.out.println("Enter the Quantity have to purchase");
	int totalQuantitytoPurchase=sc.nextInt(); 
	int totalValuation=unitPrice*totalQuantitytoPurchase; 
	System.out.println("The total purchase price is INR"+" "+totalValuation+" "+"if the quantity is"+" "+totalQuantitytoPurchase+" "+"and the unit price is"+" "+unitPrice);


        
        

        
    }
    
}
