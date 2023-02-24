import java.util.Scanner;
class SumOddWhile{
  public static void main(String args[]){
    int n,sum=0;
     Scanner sc=new Scanner(System.in);      
    System.out.println("Enter the value");     
    n=sc.nextInt();
    int i=1;
      while(i<=n){
      i=i+2;
      sum=sum+i;
      i++;
      }
      System.out.println("+sum"); 
   }
}