interface Shape{
  void draw();
}
 class Rectangle implements Shape{
  public void draw(){
  System.out.println("Rectangle");
  }
}
class Circle implements Shape{
  public void draw(){
    System.out.println("Circle");
  }
}
class InterfaceDemo{
  public static void main(String args[]){
    Shape rect=new Rectangle();
    s.draw();
  }
}