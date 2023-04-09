import java.util.Scanner;
class Book{
  private String tittle,author,publisher;
  private int bId;
  Book(String title,String author,String publisher){
    setTitle(title);
   setAuthor(author);
    setPublisher(publisher);
    setBId(bId);
  }
  void setTittle(String tittle){
    this.title=title;
  }
  void setAuthor(String author){
    this.author=author;
    
  }
  void setPublisher(String publisher){
    this.publisher=publisher;
  }
  void setBId(int bId){
    this.bId=bId;
  }
  String getTitle(){
    return this.title;
  }
  String getAuthor(){
    return this.author;
  }
  String getPublisher(){
    return this.publisher;
  }
  int getBId(){
    return this.bId;
  }
}
    public class Library{
      public static void main(String args[]){
        Library<Books> books=new ArrayList<Books>();
        Scanner sc=new Scanner(System.in):
          for(int i=0;i<5;i++){
          books.add(new books(sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()));
          
          }
        for(Books book:books){
          System.out.println(book.getbId+""+book.gettitle+""+book.getauthor+""+book.getpublisher);
        }
      }
    }
  

  
