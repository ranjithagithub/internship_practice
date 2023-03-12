import java.util.*;
class StringReverse{
 static void revereseString(String str){
    char a[]=str.toCharArray();
    String rev="";
    for(int i=a.length-1;i>=0;i--){
      rev=rev+a[i];
    }
    System.out.println(rev);
  }
  
  public static void main(String args[]){
  
    
   // revereseString("Rohith is a student");
    revereseString("ih woh era uoy");
  }
}
 
    

		
 




