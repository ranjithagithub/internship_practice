//with returntype without parameters.
import java.util.Scanner;
class MaxMethod2{
  static int maxNumber(int num1,int num2){
    num1=23;num2=33;
    if(num1>num2){
      return num1;
    }
    else{
      return num2;
    }
  }
  public static void main(String args[]){
    int max=MaxMethod2.maxNumber();
    System.out.println(max);
  
  }
}