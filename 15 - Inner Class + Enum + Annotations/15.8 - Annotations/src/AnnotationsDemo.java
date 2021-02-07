/*
 Annotations were introduced in Java 1.5
 Basic annotations:
    - @Override             - to avoid typos while implementing or overriding methods
    - @SuppressWarnings
    - @FunctionalInterface  - introduced in Java 1.8
 */

public class AnnotationsDemo {
    public static void main(String[] args) {
        B b = new B();
        b.showMyDataFromLastYearDatabase();
    }
}

class A {
    public void showMyDataFromLastYearDatabase() {
        System.out.println("Inside A");
    }
}

class B extends A {
    public void showMyDataFromLastYearDataBase() {      // There is a typo in the variable name
        System.out.println("Inside B first");
    }

    // Better way - use @Override annotation
    @Override
    @SuppressWarnings("unchecked")
    public void showMyDataFromLastYearDatabase() {
        System.out.println("Inside B overrided");
    }
}

@FunctionalInterface
interface Abc {
    void show();
}