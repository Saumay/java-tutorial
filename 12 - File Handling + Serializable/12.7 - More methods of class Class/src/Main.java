public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Class c = Class.forName("A");
        System.out.println(c.isInterface());

        System.out.println(c.getSuperclass());      // By default, all classes inherit Object class
    }
}

class A {
}