import java.util.*;
class HashMapIteratorDemo{
  public static void main(String args[]){
    HashMap<String,Integer> hashMap=new HashMap<String,Integer>();
    hashMap.put("Apple",3);
    hashMap.put("Orrange",6);
    hashMap.put("Banana",5);
    for(String key:hashMap.keySet()){
      Integer value=hashMap.get(key);
      System.out.println(key+"="+value);
    }
  }
}