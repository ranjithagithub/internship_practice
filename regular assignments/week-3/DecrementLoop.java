import java.util.Scanner;
class DecrementLoop{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);     
    System.out.println("Enter the value");      
    n=sc.nextInt();      
    for(int i=n;i>=1;i--){        
    System.out.println(i);      
    }
  }
}