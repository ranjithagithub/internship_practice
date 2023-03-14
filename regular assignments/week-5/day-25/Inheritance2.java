   class Person{
  String name;
  String gender;
  String address;
  int age;
  void print(){
    System.out.println(name+" "+gender+" "+age);
    
  }
  void printAddress(){
    System.out.println(address);
  }}
  class Student extends Person{
    int id;
    double sub1,sub2,sub3;
    void average(){
      double average=(sub1+sub2+sub3)/3;
      System.out.println("average mark is"+average);
    }
    void percentage(){
      double percentage=(sub1+sub2+sub3)/300*100;
    System.out.println("percentage is"+percentage);
    }}
    public class Inheritance2{
      public static void main(String args[]){
        Student Student=new Student();
        Student.name="ranju";
        Student.gender="female";
        Student.address="sagar";
        Student.age=23;
        Student.id=101;
        Student.sub1=52;
        Student.sub2=85;
        Student.sub3=95;
        Student.print();
        Student.printAddress();
        Student.average();
        Student.percentage();
        
      }
    }