/*
Two ways to do multi-threading:
    1) Using thread class           (in previous to previous video)
            - Make classes extend Thread class
            - Code whatever you want to be executed parallelly inside run method of class
            - Call start method using the objects
    2) Using Runnable interface     (in previous video)
            - Make classes implements Runnable interface
            - Code whatever you want to be executed parallelly inside run method of class
            - Create thread object by passing class object in Thread constructor
            - Call start method using the objects of Thread class
    3) Using lambda expressions     (this video)
            - Same as using runnable interface
            - But since runnable interface is functional interface, this can be achieved using lambda expressions also

Lambda expressions:
      - for reducing code length
      - for making code more efficient
*/

public class Main {
    public static void main(String[] args) {
        /*
        1) Using anonymous class:
            Runnable obj1 = new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<5;i++) {
                        System.out.println("Hi");
                        try { Thread.sleep(500); } catch (InterruptedException ignored) {}
                    }
                }
            };
            Runnable obj2 = new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<5;i++) {
                        System.out.println("Hello");
                        try { Thread.sleep(500); } catch (InterruptedException ignored) {}
                    }
                }
            };

        2) Using lambda expression:
            Runnable obj1 = () -> {
                    for(int i=0;i<5;i++) {
                        System.out.println("Hi");
                        try { Thread.sleep(500); } catch (InterruptedException ignored) {}
                    }
                }
            };
            Runnable obj2 = () -> {
                    for(int i=0;i<5;i++) {
                        System.out.println("Hello");
                        try { Thread.sleep(500); } catch (InterruptedException ignored) {}
                    }
                }
            };
         */

        // 3) Directly providing obj value in thread constructor
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
    }
}