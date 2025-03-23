class Display {
    // Task 1: Print "Good Morning" messages
    public synchronized void wish(String name) {
        for (int i = 0; i < 5; i++) {
            System.out.print("\nGood Morning: ");
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
            System.out.print(name);
        }
    }

    // Task 2: Print "Welcome" messages
    public synchronized void welcomeMessage() {
        for (int i = 0; i < 5; i++) {
            System.out.print("\nWelcome to Java Multithreading!");
            try { Thread.sleep(2000); } catch (InterruptedException e) {}
        }
    }
}

// Thread t1 performs wish task
class MyThread1 extends Thread {
    Display d;
    MyThread1(Display d) {
        this.d = d;
    }
    public void run() {
        d.wish("Dhoni");  // Task 1
    }
}

// Thread t2 performs welcomeMessage task
class MyThread2 extends Thread {
    Display d;
    MyThread2(Display d) {
        this.d = d;
    }
    public void run() {
        d.welcomeMessage();  // Task 2
    }
}

public class Sync1 {
    public static void main(String[] args) {
        Display d = new Display();  // Shared object

        MyThread1 t1 = new MyThread1(d);  // Thread for wish()
        MyThread2 t2 = new MyThread2(d);  // Thread for welcomeMessage()

        t1.start();
        t2.start();
    }
}
