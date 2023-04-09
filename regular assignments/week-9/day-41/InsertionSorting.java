public class InsertionSorting{
  public static void main(String args[]){
    int arr[]={20,50,10,5,30};
   int temp=0;
    int n=arr.length;
    System.out.println("Sorted array");
    for(int i=0;i<n;i++){
      for(int j=i; j>0&&a[j-1]>a[j];j--){
      if(arr[j]>arr[j+1]){
      temp=arr[j];
      arr[j] = arr[j+1];
       arr[j+1] = temp;
      }
    }
  }
     for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
  }
}
}