import java.util.Scanner;
class MaxNum{
  public static void main(String args[]){
    int firstNumber,SecondNumber,ThirdNumber;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter first number");
    firstNumber=sc.nextInt();
     System.out.println("Enter second number");
    SecondNumber=sc.nextInt();
    System.out.println("Enter third number");
    ThirdNumber=sc.nextInt();
    //check the numbers
    if((firstNumber>secondNumber)&&(firstNumber>thirdNumber))
     System.out.println("First number is maximum number");
    else if((secondNumber>firstNumber)&&(secondNumbder>thirdNumber));
    System.out.println("Second number is maximum number");
    
    System.out.println("Third number is maximum number");
     
  }
}