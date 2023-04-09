import java.util.*;
public class HashMapDemo2{
   public static void main(String args[]) {
      // Create a hash map
      HashMap hm = new HashMap();
      // Put elements to the map
      hm.put("Bag", new Integer(1100));
      hm.put("Wallet", new Integer(700));
      hm.put("Belt", new Integer(600));
      // Get a set of the entries
      Set set = hm.entrySet();
      // Get an iterator
      Iterator i = set.iterator();
      // Display elements
      while(i.hasNext()) {
         Map.Entry me = (Map.Entry)i.next();
         System.out.print(me.getKey() + ": ");
         System.out.println(me.getValue());
      }
      System.out.println();
   }
}