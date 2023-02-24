import java.util.Scanner;
class FactorForLoop{
 public static void main(String args[]){
   int n;
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the numer");
    n=sc.nextInt();
   for(int i=1;i<=n/2;i++){
     if(n%i==0)
       System.out.println(i);
   }
 } 
}