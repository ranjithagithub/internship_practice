import java.util.*;
class Rectangle{
  private double length;
  private double width;
  
  public Rectangle(double length,double width){
  this.length=length;
    this.width=width;
  }
  public double getCalculateArea(){
    return  length*width;
  }
}
public class ArrayListRectangle{
  public static void main(String args[]){
   ArrayList<Rectangle> list=new ArrayList<Rectangle>();
  Scanner sc=new Scanner(System.in);
    for(int i=0;i<4;i++){
     System.out.println("Enter the rectangle value" +(i+1)+":" );
       System.out.println("Enter length :");
            double length = sc.nextDouble();
            System.out.println("Enter width :");
            double width = sc.nextDouble();
            list.add(new Rectangle(length, width));
        }
      for (Rectangle r : list) {
            System.out.println("length is " + r.length + "\twidth is" + r.width);
        }
       }
     }
  
   
        


   