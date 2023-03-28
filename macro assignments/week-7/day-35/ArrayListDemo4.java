import java.util.*;
class ArrayListDemo4{
  public static void main(String args[]){
    List<String> fruits=new ArrayList<String>();
    fruits.add("Orrange");
    fruits.add("Mango");
    fruits.add("Apple");
    int count=0,index=0;
    for(String str:fruits){
      if(str.equals("Mango")){
      count++;
        index=fruits.indexOf("Mango");
        break;
        }
      if(count==1){
        System.out.println("fruit is found at the position:"+index);
      }
      else{
        System.out.println("Not found");
      }
      
    }
  }
}