import java.util.Scanner;
class AlphabetLoop{
  public static void main(String args[]){
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Displaying Alphabets from a to z \n");
    for(char ch='a';ch<='z';ch++){
    System.out.println(ch);
    }
  }
}