
import java.util.Scanner;
class Employee{
  int eid;
  String name;
  double salary;
  //parameterized Constructor
  Employee(int id,String n,double sal){
    eid=id;
    name=n;
    salary=sal;
  }
 
  void grossSalary(double hra,double da){
    double totalSalary=hra+da+salary;
    System.out.println(totalSalary);
  }
 
  void display(){
    System.out.println(eid+" "+name+" "+salary);
  }
  
}
 
public class EmployeeDemo{
    public static void main(String args[]){
    System.out.println("enter employee information");
    Scanner sc=new Scanner(System.in);
    Employee emp=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
    System.out.println("********Employee Information*********");
      emp.display();
      emp.grossSalary(1200, 1500);
    
  }
}







import java.util.Scanner;
class Employee{
  int eid;
  String name;
  double salary;
  //parameterized Constructor
  Employee(int id,String n,double sal){
    eid=id;
    name=n;
    salary=sal;
  }
 
  void grossSalary(double hra,double da){
    double totalSalary=hra+da+salary;
    System.out.println(totalSalary);
  }
 
  void display(){
    System.out.println(eid+" "+name+" "+salary);
  }
  
}
 
public class EmployeeDemo{
    public static void main(String args[]){
    System.out.println("enter employee information");
    Scanner sc=new Scanner(System.in);
    Employee emp[]=new Employee[5];
      
      for(int i=0;i<5;i++){
        System.out.println("enter employee "+(i+1)+ " details");
        System.out.println("enter id");
        int id=sc.nextInt();
        System.out.println("enter name");
        String name=sc.next();
        System.out.println("enter salary");
        double salary=sc.nextDouble();
        emp[i]=new Employee(id,name,salary);
      }
  
    System.out.println("********Employee Information*********");
      for(int i=0;i<5;i++){
      emp[i].display();
        System.out.println("enter hra and Da Details");
      emp[i].grossSalary(sc.nextDouble(), sc.nextDouble());
      }
      
  }
}




import java.util.Scanner;
 
class Employee {
  int eid;
  String name;
  double salary;
 
  // parameterized Constructor
  Employee(int eid, String name, double salary) {
    this.eid = eid;
    this.name = name;
    this.salary = salary;
  }
 
  void grossSalary(double hra, double da) {
    double totalSalary = hra + da + salary;
    System.out.println(totalSalary);
  }
 
  void display() {
    System.out.println(eid + " " + name + " " + salary);
    this.grossSalary(12,34);
  }
 
}
 
public class EmployeeDemo {
  public static void main(String args[]) {
    System.out.println("enter employee information");
    Scanner sc = new Scanner(System.in);
    Employee emp[] = new Employee[5];
 
    for (int i = 0; i < 2; i++) {
      System.out.println("enter employee " + (i + 1) + " details");
      System.out.println("enter id");
      int id = sc.nextInt();
      System.out.println("enter name");
      String name = sc.next();
      System.out.println("enter salary");
      double salary = sc.nextDouble();
      emp[i] = new Employee(id, name, salary);
    }
 
    System.out.println("********Employee Information*********");
    for (int i = 0; i < 2; i++) {
      emp[i].display();
      System.out.println("enter hra and Da Details");
      emp[i].grossSalary(sc.nextDouble(), sc.nextDouble());
    }
 
  }
}
 

