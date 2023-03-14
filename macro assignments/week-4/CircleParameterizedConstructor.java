//Create a class called "Circle" with instance variables for radius and diameter. Add a parameterized constructor that takes radius as a parameter and calculates the diameter, and add a method to calculate the area.


import java.util.Scanner;
class CircleParameterizedConstructor{
  int radius;
  int diameter;
  CircleParameterizedConstructor(int radius){
    this.radius=radius;
    this.diameter=2*radius;
  }
  void display(){
    System.out.println("Radius:"+radius);
    System.out.println("Diameter:"+diameter);
  }
  void area(){
    System.out.println("Area of circle is:"+(3.14*radius*radius));
  }
}
      public static void main(String args[]){
      CircleParameterizedConstructor c=new CircleParameterizedConstructor(7);
      c.display();
      c.area();
    }
  
  



