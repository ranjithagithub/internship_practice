//id,ename,address,position,salary in Employee class and add 5 employee details using array list
 

import java.util.ArrayList;

   class Employee {
    private int eid;
    private String ename;
    private String address;
    private String position;
    private double salary;

    public Employee(int eid, String ename, String address, String position, double salary) {
        this.eid = eid;
        this.ename = ename;
        this.address = address;
        this.position = position;
        this.salary = salary;
    }

    public int getEId() {
        return eid;
    }

    public String getEname() {
        return ename;
    }

    public String getAddress() {
        return address;
    }

    public String getPosition() {
        return position;
    }

    public double getSalary() {
        return salary;
    }
}
   public class ArrayListEmployee{
    public static void main(String args[]){
        ArrayList<Employee> list = new ArrayList<Employee>();

       
        list.add(new Employee(1, "Raj", "Munbai", "Manager", 45000));
        list.add(new Employee(2, "Ram", "Channai", "Developer", 30000));
        list.add(new Employee(3, "Ravi", "Bengalure", "Designer", 25000));
        list.add(new Employee(4, "Riya", "Hyderabad", "Developer", 50000));
        list.add(new Employee(5, "Reetu", "Shimoga", "Manager", 60000));

       
        for (Employee e :list) {
            System.out.println("Employee ID: " + e.getEId());
            System.out.println("Name: " + e.getEname());
            System.out.println("Address: " + e.getAddress());
            System.out.println("Position: " + e.getPosition());
            System.out.println("Salary: $" + e.getSalary() + "\n");
        }
     }
   }
