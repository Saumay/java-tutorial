/*
Both implement List interface

Vector
    - Dynamic Array.
    - will increase size by 100% once size exceeds capacity
    - introduced in Java 1.0. Later modified to work with List which was introduced in Java 1.2
    - synchronized: thread safe
    - slow

ArrayList
    - Dynamic Array
    - will increase size by 50% once size exceeds capacity
    - not synchronized: not thread safe
    - fast

Better choice: ArrayList
 */

import java.util.ArrayList;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Vector v = new Vector();
        v.add(4);
        v.add(4);
        v.add(4);
        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println();
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println();
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        v.add(4);
        System.out.println(v.size());
        System.out.println(v.capacity());
        System.out.println();

        ArrayList al = new ArrayList();
        al.add(3);
        // can't check capacity for ArrayList
    }
}
