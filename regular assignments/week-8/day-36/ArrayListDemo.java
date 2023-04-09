

//using PriorityQueue

import java.util.*;
class ArrayListDemo{
  public static void main(String args[]){
   PriorityQueue<Integer> list=new PriorityQueue<Integer>();
    list.add(123);
    list.add(345);
    list.add(875);
    System.out.println(list);
    for(Object obj:list){
      System.out.println(obj);
    }
  }
}