class Shape{
  String color;
  String filled;
  
}
class Rectangle extends Shape{
 double length,breadth;
  void get_area(){
  double area=length*breadth;
    System.out.println("Area of the rectangle is :"+area);
  }
  void displayProperties(){
    System.out.println(color+ " "+filled);
  }
}
public class InheritanceDemo1{
  public static void main(String args[]){
    Rectangle rectangle=new Rectangle();
    rectangle.color="Pink";
    rectangle.filled="No";
      rectangle.length=23;
    rectangle.breadth=34;
    rectangle.displayProperties();
    rectangle.get_area();
  }
}
  
