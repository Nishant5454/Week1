
import java.util.Scanner;

class StringEqual{ 
   static boolean isEqual(String s1,String s2){
        if(s1.equals(s2)){
            return true;
        } 
        else{
            return false;
        }
    } 
    static boolean isEqual2(String s1,String s2){
        if(s1.length()!=s2.length()){
            return false;
        } 
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return false;
            } 
        }
        return true;
    }
    public static void main(String[] args) { 
        StringEqual s=new StringEqual(); 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string 1"); 
        String st1=sc.nextLine(); 
        System.out.println("Enter string2"); 
        String st2=sc.nextLine(); 
        boolean value=isEqual(st1,st2); 
        boolean value2=isEqual2(st1,st2); 
        if(value==value2){ 
            System.out.println("Strings are equal");

        }
        else{
            System.out.println("Strings are not equal");
        }

        
    }

}