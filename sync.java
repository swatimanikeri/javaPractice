
class Display{
public synchronized  void  wish( String name) {
    for (int i = 0; i < 10; i++) {
        System.out.print("\nGood Morning: ");
    
    try{Thread.sleep(2000);}
    catch(InterruptedException e){}
    System.out.print(name);
}
}

}
class MyThread extends Thread{
    String name;
    Display d;

     MyThread(Display d,String name) {

        this.d=d;
        this.name=name;
       
    }
    public void run(){
        d.wish(name);
    }
    
}


public class sync {
   public static void main(String[] args) {
    Display d=new Display();
    MyThread t1=new MyThread(d,"Dhoni");
    t1.start();
    MyThread t2=new MyThread(d,"Yuvraj");
    t2.start();
   } 
}
