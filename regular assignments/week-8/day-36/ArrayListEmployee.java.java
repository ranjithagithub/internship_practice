import java.util.Scanner;
class Employee{
  private String name;
  private int id;
  private double salary;

Employee(String name,int id,double salary){
  setName(name);
  setId(eid);
  setSalary(salary);
}
  void setName(String name){
    this.name=name;
  }
  void setEId(int eid){
    this.eid=eid;
  }
  void setSalary(double salary){
    this.salary=salary;
  }
  String getName(){
    return this.name;
  }
  int getEId(){
    return this.eid;
  }
  double getSalary(){
    return this.salary;
  }
}
class ArrayListEmployee{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    List<Employee> list=new ArrayList<Employee>();
    for(i=0;i<5;i++){
    employee.add(new employee(sc.nextInt(),sc.nextInt(),sc.nextInt()));
      }
    for(Employee employee:list){
    System.out.println(getEId+""+getName+""+getSalary);
    }
  }
}