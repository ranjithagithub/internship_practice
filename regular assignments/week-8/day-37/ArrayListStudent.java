import java.util.ArrayList;

   class Student {
    private int id;
    private String name;
    private String major;
   

    public Student(int id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
        
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }
     public void setMajor(String major){
       this.major=major;
     }

   
}
   public class ArrayListStudent{
    public static void main(String args[]){
        ArrayList<Student> list = new ArrayList<Student>();

       
        list.add(new Student(2001, "Raj", "ComputerScience"));
        list.add(new Student(2002, "Ram", "Civil"));
        list.add(new Student(2003, "Ravi", "BioChemistry"));
        list.add(new Student(2004, "Riya","Hydrology"));
        list.add(new Student(2005, "Reetu", "Psychology"));
        list.add(new Student(2006,"Ranjitha","Electronics"));
       
        for (Student s :list) {
            System.out.println("Name: " + s.getName());
            System.out.println("Major: " + s.getMajor());
            
        }
      list.get(3).setMajor("ArtificialIntelligence");
      System.out.println("Updated information");
      System.out.println("Name: " + list.get(3).getName());
        System.out.println("ID: " + list.get(3).getId());
        System.out.println("Major: " + list.get(3).getMajor());
     }
   }