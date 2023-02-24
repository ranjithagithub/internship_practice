import java.util.Scanner;
class DivNumLoop{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the numbers");      
    n=sc.nextInt();      
    for( int i=1;i<=n;i++){
     if(i%5==0)
    System.out.println(n+ " divisible by 5"); 
    }    
  }
}