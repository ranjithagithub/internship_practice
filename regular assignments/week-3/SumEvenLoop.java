import java.util.Scanner;
class SumEvenLoop{   
  public static void main(String args[]){      
    int n,sum=0;      
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter n value");     
    n=sc.nextInt();     
    for(int i=2;i<=n;i=i+2){        
    sum=sum+i;      
    }      
    System.out.println("The sum of even numbers is"+sum);           
  }          
}