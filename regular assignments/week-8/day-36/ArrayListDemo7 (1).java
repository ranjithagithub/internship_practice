//write a Java program to shuffle elements in a array list
import java.util.*;
class ArrayListDemo7{
  public static void main(String args[]){
    List<String> list=new ArrayList<String>();
    Scanner sc=new Scanner(System.in);
    list.add("Red");
    list.add("White");
    list.add("Black");
    list.add("Orrange");
    System.out.println("before shuffling arraylist:"+list);
    Collections.shuffle(list);
    System.out.println("After shuffling arraylist:"+list);
  }
}