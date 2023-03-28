
import java.util.*;
class ArrayListDemo3{
  public static void main(String args[]){
    List<Integer> list=new ArrayList<Integer>();
    Scanner sc=new Scanner(System.in);
    list.add(2344);
    list.add(2345);
    list.add(4555);
    list.add(789);
    System.out.println(list);
    for(Integer i:list){
      System.out.println(i);
    }
  }
}