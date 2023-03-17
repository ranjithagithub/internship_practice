class InvalidAgeException extends Exception{
  InvalidAgeException(String str){
    super(str);
  }
}
class VoteEligibility{
  static void validateAge(int age) throws InvalidAgeException{
    if(age<18){
      throw new
       InvalidAgeException("Not eligible");
    }
    else{
      System.out.println("Eligible");
     }
  }
}
 
class EHDemo4{
public static void main(String args[]){
  try{
    VoteEligibility.validateAge(18);//
 }
  catch(InvalidAgeException e){
    System.out.println(e);
   }
  }
}



