import java.util.Scanner;
class StudentParamaterizedConstructor{
  int roll;
  String name,place;

  StudentParamaterizedConstructor(int r,String n,String p){
    roll=r;
    name=n;
    place=p;
  }

  void display(){
    System.out.println("student details " +roll+" "+name+" "+place);
  }
  public static void main(String args[]){
    StudentParamaterizedConstructor s=new StudentParamaterizedConstructor(12,"ranjitha","sagar");
    s.display();
  }
}