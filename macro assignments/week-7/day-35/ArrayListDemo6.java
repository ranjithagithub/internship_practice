import java.util.*;
class ArrayListDemo6{
  public static void main(String args[]){
    List<String> list=new ArrayList<String>();
   list.add("red");
    list.add("white");
    list.add("black");
      System.out.println(list);
      
     list.add(0, "Pink");
    System.out.println(list);
    for(String str:list){
      System.out.println(str);
    }
     }
}