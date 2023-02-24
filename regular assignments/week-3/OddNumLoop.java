import java.util.Scanner;
class OddNumLoop{
  public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter odd Value");
    n=sc.nextInt();
    for(i=1;i<=n;i++){
    if(i%2!=0)
    System.out.println(i);
    }
  }
}