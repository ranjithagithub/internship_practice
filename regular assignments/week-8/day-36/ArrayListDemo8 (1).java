//Write a Java program to remove the third element from a array list
import java.util.*;
  public class ArrayListDemo8 {
  public static void main(String[] args) {
  // Creae a list and add some colors to the list
  List<String> list = new ArrayList<String>();
  list.add("Red");
  list.add("Green");
  list.add("Orange");
  list.add("White");
  list.add("Black");
  System.out.println(list);
  // Remove the third element from the list.
  list.remove(2);
  // Print the list again
  System.out.println("After removing third element from the list:\n"+list);
 }
}