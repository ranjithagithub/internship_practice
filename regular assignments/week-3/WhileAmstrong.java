import java.util.Scanner;
class WhileAmstrong{
  public static void main(String args){
    Scanner sc=new Scsanner(System.in);
    System.out.println("Enter the number");
     n=sc.nextInt();
    int n,reminder=0,result=0,count;
    original number=result;
    while(n!=0){
      reminder=n%10;        
      result=result+(int)Math.pow(reminder,count);        
      n=n/10; 
    }
   if( result=original number){
     System.out.println("it is a armstrong number");
     }
    else
   {
     System.out.println("it is not armstrong number" );
   }
  }
}