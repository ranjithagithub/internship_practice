import java.util.*;
class StringWord{
  static void wordsSplit(String str){
   String words[]= str.split(" ");
   for(int i=0;i<words.length;i++){
     if(words[i].length()==3){
       System.out.println(words[i]);
     }
   }
    
  }
 
  public static void main(String args[]){
  
    wordsSplit("hi how are you");
    
   
    
  }
}
