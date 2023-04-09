import java.util.*;
import java.util.Map;
class HashMapDemo{
  public static void main(String args[]){
    HashMap<String,Integer> map=new HashMap<String,Integer>();
    map.put("Ranjitha",123);
    map.put("Riya",123);
    map.put("Reetu",124);
    map.remove(124);
    System.out.println(map);
    for(Map.Entry m:map.entrySet()){
      System.out.println(m.getKey()+""+m.getValue());
    }
  }
}