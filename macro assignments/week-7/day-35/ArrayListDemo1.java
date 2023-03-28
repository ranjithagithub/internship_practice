import java.util.*;
class ArrayListDemo1{
  public static void main(String args[]){
    List list=new ArrayList();
    Scanner sc=new Scanner(System.in);
    list.add(123);
    list.add(234);
    list.add(345);
    System.out.println(list);
    for(Object str:list){
      System.out.println(str);
    }
  }
}