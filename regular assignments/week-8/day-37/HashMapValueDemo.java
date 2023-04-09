import java.util.*;
class HashMapValueDemo{
  public static void main(String args[]){
    HashMap<String,Integer> prices=new HashMap<String,Integer>();
    prices.put("Tomato",50);
    prices.put("Potato",70);
    prices.put("Carrot",60);
    for(Integer price:prices.values()){
     System.out.println(price);
    }
  }
}