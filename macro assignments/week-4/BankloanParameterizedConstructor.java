//Create a class called "BankLoan" with instance variables for loan amount, interest rate, and payment period. Add a constructor that takes loan amount and interest rate as parameters, and calculates the payment period based on the payment amount.
​
import java.util.*;
 class Bank {
  int balance;
  int account_number;

  Bank( int balance ,int account_number){
    this.balance=balance;
    this.account_number=account_number;
  }
   void deposit(int amount) {
    balance = balance + amount;
  }
   void withdraw(int amount) {
    balance = balance - amount;
  }
   void display() {
    System.out.println("Balance is: " + balance);
  }
}
public class BankUsingConstructor{
  public static void main(String[] args) {
    BankAccount obj = new BankAccount();
    obj.balance = 1000;
    obj.account_number = 12345;

    obj.deposit(500);
    obj.withdraw(200);
    obj.display();
  }
}



