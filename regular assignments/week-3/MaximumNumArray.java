public class MaximumNumArray{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int(5);
    System.out.println("Enter the array value")
      int arr[]max=arr[0];
      for (int i=0;i<5;i++){
      if(arr[i]>max)
        max=arr[i];
    }
    System.out.println("Maximum number:" +max);
  }
}