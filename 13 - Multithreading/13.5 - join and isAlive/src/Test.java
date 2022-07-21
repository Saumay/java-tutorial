// join method: will wait for the thread to complete execution and join parent thread
// isAlive method: returns true if thread is alive

public class Test {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for(int i=0;i<5;i++) {
                System.out.println("Hi");
                try { Thread.sleep(500); } catch (InterruptedException ignored) {}
            }
        });
        Thread t2 = new Thread(() -> {
            for(int i=0;i<5;i++) {
                System.out.println("Hello");
                try { Thread.sleep(500); } catch (InterruptedException ignored) {}
            }
        });

        t1.start();
        try { Thread.sleep(10); } catch (InterruptedException ignored) {}
        t2.start();

        System.out.println("BYEEE IN BETWEEN");    // This won't be printed at the end because Main thread is idle and will execute this before only.
        System.out.println("Is t1 alive: " + t1.isAlive());

        t1.join();      // will wait for t1 to complete execution and join main thread
        t2.join();      // will wait for t2 to complete execution and join main thread
        System.out.println("BYEE AT THE END");

        System.out.println("Is t1 alive: " + t1.isAlive());
    }
}
