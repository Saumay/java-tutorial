/*
Consumer producer problem: We want consumer to consume only when producer has produced.
If there is a mismatch in consumption and production time, consumer will be consuming the wrong value.
To overcome this, we need both the threads to somehow communicate with each other, such that Consumer consumes only when producer has produced.

wait() and notify():
    - belongs to Object class
    - can only be called from a synchronized method
*/

public class Test {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}

class Q {
    int num;
    boolean valueSet = false;   // means value is set or not

    public synchronized void setNum(int num) {      // for using wait method, method should be synchronized
        while(valueSet) {
            try { wait(); } catch (InterruptedException ignored) {}
        }
        System.out.println("Put: " + num);
        this.num = num;
        valueSet = true;
        notify();               // will notify consumer
    }

    public synchronized void getNum() {             // for using wait method, method should be synchronized
        while(!valueSet) {
            try { wait(); } catch (InterruptedException ignored) {}
        }
        System.out.println("Get: " + num);
        valueSet = false;
        notify();               // will notify producer
    }
}

class Producer implements Runnable {
    Q q;

    public Producer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Producer");
        t.start();
    }
    public void run() {
        int i = 0;
        while (true) {
            q.setNum(i++);
            try { Thread.sleep(500); } catch (InterruptedException ignored) {}
        }
    }
}

class Consumer implements Runnable {
    Q q;

    public Consumer(Q q) {
        this.q = q;
        Thread t = new Thread(this, "Consumer");
        t.start();
    }
    public void run() {
        while(true) {
            q.getNum();
            try { Thread.sleep(2500); } catch (InterruptedException ignored) {}
        }
    }
}
