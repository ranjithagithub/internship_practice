//interface ATM
  //withdraw()
  //deposit()
  //getBalance()
 
  //SBIATM
interface ATM{
  void withdraw();
  void deposit();
  void getBalance();
}
class SBIATM implements ATM{
  public void withdraw(){
    int samt=500;
    System.out.println("Enter the withdraw amount is 300");
  }
  public void deposit(){
    int damt=400;
    System.out.println("Enter the deposit amount is 400");
  }
  public void getBalance(){
    int bamt=300;
    System.out.println("Enter the balance amount is.");
    
    }
  }
class InterfaceDemo2{
  public static void main(String args[]){
    ATM sbiatm=new SBIATM();
    sbiatm.withdraw();
    sbiatm.deposit();
    sbiatm.geBalance();
  }
}