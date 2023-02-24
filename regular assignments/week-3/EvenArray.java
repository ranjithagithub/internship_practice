import java.util.Scanner;
  class EvenArray{
     public static void main(String args[]){
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    int[]arr=new int[n];
    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }
   int count_even=0;
    for(int i=0;i<=n;i++){
      if (arr[i]%2==0)
    System.out.println("Even:" +Count_even);
    }
  }
}