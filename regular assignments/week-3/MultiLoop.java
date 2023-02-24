import java.util.Scanner;
class MultiLoop{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter n value");    
    n=sc.nextInt();      
    for(int i=1;i<=10;i++){
      System.out.println(n+"*"+i+"="+(n*i));
    }
  }
}