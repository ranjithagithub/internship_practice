

public class SelectionSorting{
  public static void main(String args[]){
    int arr[]={20,50,10,5,30};
    int temp=0;
    int n=arr.length;
    System.out.println("sorted array");
    for(int i=0; i<n;i++){
      for(int j=i+1;j<n;j++){
        if(arr[i]>arr[j]){
           temp=arr[j];
      arr[j] = arr[i];
       arr[i] = temp;
        }
      }
    }
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i]+" ");
  }
 }
}