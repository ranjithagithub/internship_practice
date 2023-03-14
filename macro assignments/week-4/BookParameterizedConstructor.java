//Create a class called "Book" with instance variables for title, author, and publication year. Add a constructor that takes all three variables as parameters and sets the values.
 


import java.util.*;
class BookParamaterizedConstructor{
  String title,author;
  int year;

  BookParamaterizedConstructor(String t,String a,int y){
   title=t;
   author=a;
   year=y;
  }

  void display(){
    System.out.println("the title of the book is -"+title);
    System.out.println("the author of the book is -"+author);
    System.out.println("the publication year of the book is -"+year);
    System.out.println("/-/-/-/-/-/-/-/ \n");
    
  }

  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    BookParamaterizedConstructor b=new BookParamaterizedConstructor("Panchatantra","Ranjitha",2001);;
    b.display();
  }
}