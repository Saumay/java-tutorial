/*
Types of Inner Classes:
    1) Member Class
    2) Static Class
    3) Anonymous Inner Class and Lambda

Class files names:
    Normal classes:
        A.class
        B.class
    Inner classes: (ParentClass$InnerClass.class)
        A.class
        A$B.class
    Anonymous Inner classes: (ParentClass$SerialNumberOfClass.class)
        Main$1.class
 */

public class Main {
    public static void main(String[] args) {
        // 1) Member Inner Variable
        // We can directly create object of A
        A aObj = new A();
        aObj.ma = 5;
        System.out.println(aObj.ma);

        // For creating object of inner class
        A.B bObj = aObj.new B();
        bObj.mb = 10;
        System.out.println(bObj.mb);


        // 2) Static Inner Class
        // Accessing static variable
        A.sa = 15;
        System.out.println(A.sa);

        // Accessing static class
        A.C cObj = new A.C();
        cObj.mc = 20;
        System.out.println(cObj.mc);
    }
}

class A {
    int ma;
    // 1) Member Inner Class
    class B {
        int mb;
    }

    static int sa;
    // 2) Static Inner Class
    static class C {
        int mc;
    }
}