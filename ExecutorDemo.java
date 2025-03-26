import java.util.concurrent.*;

class PrintJob implements Runnable {
    String name;

    PrintJob(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(name + "  Job started by Thread " + Thread.currentThread().getName());
        try {
            Thread.sleep(20000);  
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();  
        }
        System.out.println(name + "  Job completed by Thread " + Thread.currentThread().getName());
    }
}

public class ExecutorDemo {
    public static void main(String[] args) {
        
        PrintJob[] jobs = { new PrintJob("Swati"), new PrintJob("John"), new PrintJob("Alice") };

       
        ExecutorService service = Executors.newFixedThreadPool(3);

       
        for (PrintJob job : jobs) {
            service.submit(job);
        }

        service.shutdown();
    }
}
