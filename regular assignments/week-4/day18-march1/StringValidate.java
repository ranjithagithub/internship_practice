import java.util.*;
class StringValidate{
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