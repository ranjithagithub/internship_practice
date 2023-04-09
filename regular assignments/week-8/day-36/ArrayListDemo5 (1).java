//Write a Java program to create a new array list, add some colors (string) and print out the collection
import java.util.*;
class ArrayListDemo5{
  public static void main(String args[]){
    List<String> list=new ArrayList<String>();
    Scanner sc=new Scanner(System.in);
    for(int i=0;i<5;i++){
     list.add(sc.next()); 
    }
    System.out.println(list);
    for(String str:list){
      System.out.println(str);
    }
    }
}