import java.util.Scanner;
class EvenNumLoop{
  public static void main(String args[]){
    int n;
   Scanner sc=new Scanner(System.in);      
    System.out.println("Enter Even value");    
    n=sc.nextInt();      
    for(int i=1;i<=n;i++){
   if (i%2==0)
      System.out.println(i);     
    }          
  }
}