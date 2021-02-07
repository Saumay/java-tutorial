/*
Two ways to do multi-threading:
    1) Using thread class           (in previous video)
            - Make classes for which code has to be executed in a separate thread extend Thread class
            - Code whatever you want to be executed parallelly inside run method of class
            - Call start method using the objects
    2) Using Runnable interface     (in this video)
            - Make classes for which code has to be executed in a separate thread extend Runnable interface
            - Code whatever you want to be executed parallelly inside run method of class
            - Create thread object by passing class object as constructor
            - Call start method using the objects of Thread class
 */

public class Main {
    public static void main(String[] args) {
        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}

/*
 Class which needs to be run parallelly needs to do 2 things:
    - Implement Runnable interface
    - Put the code that needs to be executed parallelly in run method
 */
class Hi implements Runnable {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Hi");
            try { Thread.sleep(500); } catch (InterruptedException ignored) {}
        }
    }
}

class Hello implements Runnable {
    public void run() {
        for(int i=0;i<5;i++) {
            System.out.println("Hello");
            try { Thread.sleep(500); } catch (InterruptedException ignored) {}
        }
    }
}