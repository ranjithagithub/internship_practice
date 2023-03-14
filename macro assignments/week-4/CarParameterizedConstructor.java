import java.util.*;
class CarParameterizedConstructor{
  String name,model;
  int year;

  CarParameterizedConstructor(String n,String m,int y){
    name=n;
    model=m;
    year=y;
  }

  void display(){
    System.out.println("the name of the car is -"+name);
    System.out.println("the model of the car is -"+model);
    System.out.println("the car launched in the year -"+year);
    System.out.println("/-/-/-/-/-/-/-/ \n");
    
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    CarParameterizedConstructor c=new CarParameterizedConstructor("BMW","new",2022);
    c.display();
  }
}



