public class ThreadsIntro{ 
public static void main(String[]args) {
System.out.println("Reached main method of program. Running on thread: "+Thread.currentThread().getName());
MyThread myThread = new MyThread();
myThread.start();

Thread thread2 = new Thread("thread2") { //create anonymous subclass of thread
public void run(){
System.out.println("Executing "+  getName());
try{
Thread.sleep(2000);}
catch(Exception e){
System.out.println(e.getMessage());}

System.out.println(getName()+" resumed");
}
};
thread2.start();

}
}
class MyThread extends Thread{
public void run(){
System.out.println("Running thread using "+ getName());
try{
Thread.sleep(5000);}
catch(Exception e){
System.out.println(e.getMessage());}
System.out.println(getName()+" resumed");
}
}