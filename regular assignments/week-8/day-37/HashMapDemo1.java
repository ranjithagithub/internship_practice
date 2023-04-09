import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.*;
 
class Student{
  int id;
  String name;
  Student(int id,String name){
    this.id=id;
    this.name=name;
  }
}
class HashMapDemo1{
  public static void main(String args[]){
    LinkedHashMap<Integer,Student> map=new LinkedHashMap<Integer,Student>();
    Scanner sc=new Scanner(System.in);
    for(int i=1;i<=3;i++){
      map.put(i,new Student(sc.nextInt(),sc.next()));
    }
 
    for(Map.Entry m:map.entrySet()){
      Student st=(Student)m.getValue(); 
      System.out.println("key is "+m.getKey()+"value is "+m.getValue());
      System.out.println("values are");
      System.out.println(st.rollno+" "+st.name);
      
    }
  }
}
 