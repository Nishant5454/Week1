
import java.util.Scanner;
import javax.sound.sampled.SourceDataLine;

public  class NumberFormatException{ 
    static  void checkNumberException(String str){

        try{
            int num=Integer.parseInt(str);
            System.out.println(num);
        }
        //catch(NumberFormatException ne){
           // throw new NumberFormatException;
      //  } 
        catch(Exception e){
            System.out.println("Number Format Exception");
        }
    }
    public static void main(String[] args) {
        NumberFormatException ne=new NumberFormatException(); 
        Scanner sc=new Scanner(System.in); 
        System.out.println("Enter the string"); 
        String value=sc.nextLine(); 
        checkNumberException(value); 
        sc.close();
        
    }
    
}