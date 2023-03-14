class Shape{
  String color;
  String filled;
}
class Rectangle extends Shape{
  double width,length;
  void get_area(){
   double area=length*width;
    System.out.println("The area of the rectangle is:" +area);
  }
}
 public class Inheritance3{
      public static void main(String args[]){
        Rectangle rectangle=new Rectangle();
        rectangle.color="red";
        rectangle.filled="yes";
        rectangle.length=12;
        rectangle.width=12;
        rectangle.get_area();
        
      }
 }
        