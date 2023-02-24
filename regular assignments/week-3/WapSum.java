//WAP to find first and last digit of a number
import java.util.Scanner;
class WapSum{  
  public static void main(String args[]){      
    Scanner sc=new Scanner(System.in);      
    System.out.println("Enter n value");    
    int n=sc.nextInt();
    int firstdigit=0,lastdigit=0,sum=0;
    lastdigit=n%10;            
    while(n>10){      
      n=n/10;     
    }     
    firstdigit=n;
    sum=firstdigit+lastdigit;
    System.out.println("sum of firstdigit and lastdigit:"+sum);        
  } 
}
   
  