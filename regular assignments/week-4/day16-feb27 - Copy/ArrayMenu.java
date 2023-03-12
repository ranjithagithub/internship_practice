//application
 
 // menu
  //1.insertion
  //2.insert at last
 // 3.insert at first
 // 4.insert at specific
 // 5.delete at first
 // 6.delete at last
 // 7.delete at specific position
 // 8.search for an element
  //9.find the frequency of each number
 // 10.display
 
 // select the opttion
 
 // 1
  //insert the data
 
  //do you want to continue
 

//1.insertion
 // 2.insert at last
  //3.insert at first
  //4.insert at specific
 // 5.delete at first
  //6.delete at last
  //7.delete at specific position
  //8.search for an element
  //9.find the frequency of each number
  //10.display
  
//select the opttion
 
 // 1
  //insert the data
 
 // do you want to continue
 
//n/
 
    
import java.util.Scanner;
class ArrayMenu{

  static void insertArrayElements(int n,int a[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter elements in array");
    for(int i=0;i<n;i++){
      a[i]=sc.nextInt();
    }
  }

  static void insertAtFirst(int n,int newElement,int ab[]){
    for(int i=n-1;n>=0;i--){
      ab[i+1]=ab[i];
    }
    ab[0]=newElement;
  }

  static void insertAtLast(int n,int newElement,int c[]){
    c[n]=newElement;
  }
  
  static void display(int n,int b[]){
    for(int i=0;i<=n;i++){
      System.out.println(b[i]);
    }
  }

  
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("1.insertion");
    System.out.println("2.insert at last");
    System.out.println("3.insert at first");
    System.out.println("4.insert at specific"); 
    System.out.println("5.delete at first");
    System.out.println("6.delete at last");
    System.out.println("7.delete at specific");
    System.out.println("8.search for an element");
    System.out.println("9.find the frequency of each number");
    System.out.println("display");
   

    System.out.println("enter the choice");
    int choice=sc.nextInt();
    
    System.out.println("enter the size");
    int n=sc.nextInt();

    int a[]=new int[50];

    switch(choice){
      case 1:
        insertArrayElements(n,a);
        display(n, a);
        break;
      case 2:
        insertArrayElements(n,a);
        System.out.println("enter new element");
        int newElement=sc.nextInt();
        insertAtFirst(n,newElement,a);
        display(n+1, a);
        break;
      case 3:
        insertArrayElements(n,a);
        System.out.println("enter new element");
        int newElement2=sc.nextInt();
        insertAtLast(n,newElement2,a);
        display(n+1, a);
        break;
    
        
        
    }
  }
}