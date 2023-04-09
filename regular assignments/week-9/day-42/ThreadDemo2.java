//implementing runnable class
class RunThread implements Runnable{
  public void run(){
    System.out.println("Thread is processing");
  }
}
class ThreadDemo2{
  public static void main(String args[]){
    RunThread t=new RunThread();
    Thread thread=new Thread(t);
    thread.start();
  }
}