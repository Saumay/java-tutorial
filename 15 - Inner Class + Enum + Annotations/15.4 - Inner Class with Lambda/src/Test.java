/*
Class files names:
    Normal classes:
        A.class
        B.class
    Inner classes: (ParentClass$InnerClass.class)
        A.class
        A$B.class
    Anonymous Inner classes: (ParentClass$SerialNumberOfClass.class)
        Main$1.class
    Lambda classes:
        Empty (No extra class is created for lambda class)

Anonymous Class:
    - Can be used with any class
    - Benefit:
        - Removes boilerplate code (redundant code) or reduces the code
Lambda:
    - Can only be used with functional interfaces
    - Benefit:
        - Removes boilerplate code
        - No extra .class file is created
        - Stream APIs
 */

public class Test {
    public static void main(String[] args) {
        // Traditional approach
        A obj = new AImpl();
        obj.show();
        
        
        // Using anonymous class for AImpl class
        A obj2 = new AImpl() {
            public void show() {
                System.out.println("Inside AImpl anonymous class");
            }
        };
        obj2.show();


        // Using anonymous class for A interface
        A obj3 = new A() {
            public void show() {
                System.out.println("Inside A interface anonymous class");
            }
        };
        obj3.show();
        
        
        // Using lambda for A interface (Introduced in Java 1.8)k
        A obj4 = () -> System.out.println("Inside A interface lambda");
        obj4.show();
    }
}

@FunctionalInterface
interface A {
    void show();
    // void method2();          Won't allow declaration of more than 1 method, since it's functional interface
}

class AImpl implements A {
    public void show() {
        System.out.println("In A");
    }
}
