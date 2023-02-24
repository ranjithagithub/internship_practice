//WAP to count number of digits in a number.
  import java.util.Scanner;
class WapCountLoop{
  public static void main(String args[]){
  int num;
  int count=0;
  Scanner sc=new Scanner(System.in);      
  System.out.println("Enter a value");    
  num=sc.nextInt();
  for(;num!=0;num=num/10){
      count++;
    }
  System.out.println(+count);
 }    
}