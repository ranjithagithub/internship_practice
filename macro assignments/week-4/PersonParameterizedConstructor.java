//Create a class called "Person" with instance variables for name, age, and address. Add a parameterized constructor that takes name and age as parameters, and initializes the address to a default value.
 



import java.util.*;
class PersonParameterizedConstructor{
  String name,adress;
  int age;

  PersonParameterizedConstructor(String n,String a,int ag){
    name=n;
   adress=a;
    age=ag;
  }

  void display(){
    System.out.println("the name of the person is -"+name);
    System.out.println("the adress of the person is -"+adress);
    System.out.println("the age of the person is -"+age);
    System.out.println("/-/-/-/-/-/-/-/ \n");
    
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
   PersonParameterizedConstructor p=new PersonParameterizedConstructor("ranjitha","Sagar",22);
    p.display();
  }
}
