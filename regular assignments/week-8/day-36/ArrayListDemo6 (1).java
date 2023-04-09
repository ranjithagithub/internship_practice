//Using stack class


import java.util.*;
class ArrayListDemo6{
  public static void main(String args[]){
    Stack<String> list=new Stack<String>();
   list.push("red");
    list.push("white");
    list.push("black");
      System.out.println(list);
      
     list.add(0, "Pink");
    System.out.println(list);
    for(String str:list){
      System.out.println(str);
    }
     }
}