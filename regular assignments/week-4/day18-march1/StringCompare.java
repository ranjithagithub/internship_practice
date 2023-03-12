
import java.util.*;
class StringCompare{
 
  static void compareStrings(String str1, String str2){
    if(str1.equals(str2)){
      System.out.println("Strings are equal");
    }
    else{
      System.out.println("not equal");
    }
  }
 
  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String str1,str2;
    System.out.println("enter string1"); 
   str1=sc.nextLine();
    System.out.println("enter string2"); 
  str2=sc.nextLine();
    
    compareStrings(str1,str2);
    
  }
}
 