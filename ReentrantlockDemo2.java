import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.*;

class MyThread extends Thread {
    static ReentrantLock l = new ReentrantLock();

    MyThread(String name) {
        super(name);
    }

    public void run() {
        try {
            if (l.tryLock(5, TimeUnit.SECONDS)) {  // Corrected syntax
                System.out.println(Thread.currentThread().getName() + " got lock");
                Thread.sleep(6000);  // Simulating work
                l.unlock();  // Unlock after use
            } else {
                System.out.println(Thread.currentThread().getName() + " not able to get lock");
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() + " interrupted");
        }
    }
}

public class ReentrantlockDemo2 {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("swata");
        MyThread t2 = new MyThread("tommu");
        t1.start();
        t2.start();
    }
}
