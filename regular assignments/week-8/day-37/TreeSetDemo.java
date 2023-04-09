import java.util.TreeSet;

class TreeSetDemo{
    public static void main(String[] args) {
     TreeSet<Integer> evenNumbers = new TreeSet<Integer>();
      evenNumbers.add(2);
      evenNumbers.add(4);
      evenNumbers.add(6);
      System.out.println("TreeSet: " + evenNumbers);
    
    for(Integer i:evenNumbers){
    System.out.println(i);
     }
   }
}