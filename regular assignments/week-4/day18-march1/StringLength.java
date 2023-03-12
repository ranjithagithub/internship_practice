//import java.util.*;
//class StringLength{
//static void checkSubString(String str1,String subString ){
 //   if(str1.contains(subString)){
  //    for(int i=0;i<subString.length()-1;i++){
//        if(subString.charAt(i)=='a'||subString.charAt(i)=='e'||subString.charAt(i)=='i'||subString.charAt(i)=='o'||subString.charAt(i)=='u'){
//          System.out.print(subString.charAt(i));
//          
 //       }
//      }
         }
    else{
      System.out.println("invalid");
    }
  }
 
  
  public static void main(String args[]){
  checkSubString("welcome to bitlabs","bitlabs");
    
  }
}
 
  
import java.util.*;
class StringLength{
 
  static void validateString(String str1){
    if(str1.startsWith("R") && str1.endsWith(".com"))
    {
      System.out.println("valid");
    }
    else{
      System.out.println("not valid");
    }
   
  }
 
  
  public static void main(String args[]){
  
    
    validateString("Ranjithabv2001@gmail.com");
    
  }
}
 