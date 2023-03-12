import java.util.*;
class StringConvert{
  static void convert(String str1){
  char ar[]=str1.toCharArray();
    int count=0;
    for(int i=0;i<ar.length;i++){
     if(ar[i]=='a'||ar[i]=='e'||ar[i]=='i'||ar[i]=='o'||ar[i]=='u'){
       count++;
     }
    }
    System.out.println(count);
   
  }
  
  public static void main(String args[]){
 
    
    convert("Ranjithabv2001@gmail.com");
    
  }
}

      
     
      
  