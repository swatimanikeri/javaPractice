import java.util.concurrent.locks.*;
class Display{
    ReentrantLock l=new ReentrantLock();
    public void wish( String name){
        l.lock();
    for(int i=0;i<10;i++){
        System.out.print("Good Morning: ");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        System.out.println(name);
    }
    l.unlock();
}}

class MyThread extends Thread{
    String name ;
    Display d;
    MyThread(String name, Display d){
     this.name=name;
     this.d=d;
    }
    public void run(){
        d.wish(name);
    }
}
public class ReentrantlockDemo {
    public static void main(String[] args) {
        Display d= new Display();
        MyThread  t1=new MyThread ("swata",d);
        MyThread  t2=new MyThread ("tommu",d);
        t1.start();
        t2.start();  
    }
   
}
