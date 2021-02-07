/*
Two ways to do multi-threading:
    1) Using thread class           (in this video)
            - Make classes for which code has to be executed in a separate thread extend Thread class
            - Code whatever you want to be executed parallelly inside run method of class
            - Call start method using the objects
    2) Using Runnable interface     (in next video)
            - Make classes for which code has to be executed in a separate thread extend Runnable interface
            - Code whatever you want to be executed parallelly inside run method of class
            - Create thread object by passing class object as constructor
            - Call start method using the objects of Thread class
 */

public class Main {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        /**
         * Main thread will execute both these methods with 0.3 second pause after every print statement.
         * Other method's execution also has to wait because of this, which is not desirable in most cases.
         * Independent methods could be executed parallelly. <br><br>
         *
         * obj1.run();
         * obj2.run();
         */

        // Below methods will call the methods parallelly.
        obj1.start();
        obj2.start();
    }
}

/*
 Class which needs to be run parallelly needs to do 2 things:
    - Extend Thread class
    - Put the code that needs to be executed parallelly in run method
 */

class Hi extends Thread {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Hi");
            try { Thread.sleep(500); } catch (InterruptedException ignored) {}
        }
    }
}

class Hello extends Thread {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Hello");
            try { Thread.sleep(500); } catch (InterruptedException ignored) {}
        }
    }
}