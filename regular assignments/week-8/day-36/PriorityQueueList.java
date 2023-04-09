import java.util.*;
class PriorityQueueList{
  public static void main(String args[]){
    PriorityQueue<String> list=new PriorityQueue<String>();
    Scanner sc=new Scanner(System.in);
    list.add("Ranjitha");
    list.add("Riya");
    list.add("Reetu");
    System.out.println(list);
    for(String str:list){
      System.out.println(str);
    }
  }
}