class RunThread extends Thread{
  public void run(){
    System.out.println("Thread is processing");
     }
}
class ThreadDemo1{
  public static void main(String args[]){
    RunThread t=new RunThread();
    t.start();
  }
}