import java.util.Scanner;

 

class GrossSalary{
  public static void main(String args[]) {
    double basic_salary,gross_salary;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the basic salary");
    basic_salary= sc.nextDouble();
    if(basic_salary<=10000){
      gross_salary=basic_salary+(basic_salary*20/100)+(basic_salary*80/100);
      System.out.println(gross_salary);
    } 
     else if(basic_salary<=20000){
       gross_salary=basic_salary+(basic_salary*25/100)+(basic_salary*90/100);
      System.out.println(gross_salary); 
     }
    else{
       gross_salary=basic_salary+(basic_salary*30/100)+(basic_salary*95/100);
      System.out.println(gross_salary);
    }
  }
}
 