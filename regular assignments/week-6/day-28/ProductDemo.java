//Create a class called "Product" that represents a product. The class should have properties such as name, price, and quantity, and methods such as getName, getPrice and getQuantity.
class Product{
 private String pname;
  private double price;
  private int pquantity;

void setPname(String pname){
  this.pname=pname;
}
void setPrice(double price){
  this.price=price;
}
void setPquantity(int pquantity){
  this.pquantity=pquantity;
}
String getPname(){
  return this.pname;
  }
double getPrice(){
  return this.price;
}
int getPquantity(){
  return this.pquantity;
 }
}
public  class ProductDemo{
  public static void main(String args[]){
    Product  p = new Product();
    p.setpname("Mobile"); 
    p.setprice("15000");
    p.setpquantity("500gms");
    System.out.println(p.getPname() + " " + p.getPrice() + " " + p.getPquantity());
  }
}