/*
Anonymous Class: Can be used with any class
Lambda: Can only be used with functional interfaces
 */

public class Test {
    public static void main(String[] args) {
        // ANONYMOUS CLASS
        A obj1 = new A();
        obj1.show();

        A obj2 = new A() {
            public void show() {
                System.out.println("Hello anonymous");
            }
            public void newMethod() {
                System.out.println("Inside new method");
            }
            public void privateShow() {
                System.out.println("Inside private show");
            }
        };
        obj2.show();                 // Can call show because it's defined in A and is public
//         obj2.newMethod();         // Can't call newMethod()
//         obj2.privateShow();       // Can't call privateShow() method as it is private in A class
    }
}

class A {
    public void show() {
        System.out.println("Hello");
    }

    private void privateShow() {
        System.out.println("Inside private show");
    }
}
