
import java.util.Scanner;

public class Collinerpoint{
   public static boolean ispointsareCollinear(int x1,int y1,int x2,int y2,int x3,int y3){
        double slopeAB=(double)(y2-y1)/(x2-x1); // formula dervied using straight lines
        double slopeBC=(double)(y3-y2)/(x3-x1);
        double slopeAC=(double)(y3-y1)/(x3-x1); 
        return slopeAB==slopeBC&&slopeBC==slopeAC;// return if their slopes are equal


    
} 
public static boolean ispointsareCollinearviaDeterminantMethod(int x1,int y1,int x2,int y2,int x3,int y3){
    double area=0.5*Math.abs(x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)); // return the slope using area of triangle
    return area==0;

}
public static void main(String[] args) {
    Collinerpoint cp=new Collinerpoint(); 
    Scanner sc=new Scanner(System.in);//Take inputs for 3 points x1, y1, x2, y2, and x3, y3

    System.out.println("Enter value of x1:"); 
    int x1=sc.nextInt(); 
    System.out.println("Enter value of y1:"); 
    int y1=sc.nextInt(); 
    
    System.out.println("Enter value of x2:"); 
    int x2=sc.nextInt(); 
    System.out.println("Enter value of y2:"); 
    int y2=sc.nextInt(); 
    System.out.println("Enter value of x3:"); 
    int x3=sc.nextInt(); 
    System.out.println("Enter value of y3:"); 
    int y3=sc.nextInt();  
    boolean collinearslope=ispointsareCollinear(x1, y1, x2, y2, x3, y3); 
    System.out.println("The collinear slope of the point is "+collinearslope);
    boolean collinearArea=ispointsareCollinearviaDeterminantMethod(x1, y1, x2, y2, x3, y3); 
    System.out.println("The collinear area of the points are "+collinearArea);
    sc.close();
    

} 



}