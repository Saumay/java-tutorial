public class Test {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();

        Thread t1 = new Thread(() -> {
           for(int i=0;i<1000;i++)
               c.increment();
        });
        Thread t2 = new Thread(() -> {
            for(int i=0;i<1000;i++)
                c.increment();
        });

        t1.start();
        t2.start();
        System.out.println("count: " + c.count);        // Main thread will not wait for t1 and t2 to finish and will return count value as 0.

        t1.join();
        t2.join();
        System.out.println("count: " + c.count);        // Value should be 2000 but won't be because on multiple occasions, t1 and t2
                                                        // will read same value of count and will assign same value after addition
                                                        // SOLUTION: Do not allow both threads to access the method at the same time
                                                        //      - Make the method synchronized.
    }
}

class Counter {
    int count;

    /*
    Not thread safe: Not synchronized

    public void increment() {
        count++;    // count = count + 1;
    }
    */

    // Thread safe: Synchronized
    public synchronized void increment() {
        count++;    // count = count + 1;
    }
}
