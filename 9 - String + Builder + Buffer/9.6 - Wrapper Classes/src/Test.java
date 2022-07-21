/*
Java is 99.9% object oriented language
Reason: Wrapper Classes

Wrapper Classes:
    - present from 1st version
    - In Java, we have primitive data types like int, float, double. For these primitive data types, we have corresponding Wrapper Classes as well
    - Boxing/Auto-boxing: Converting primitive int to object Integer
    - Unboxing/Auto-unboxing: Converting object Integer to primitive int
    - Usages
        - Generics only work with classes, and not with primitive types
        - In case of for-each, use primitve types as they are faster

Use wrapper classes while working with frameworks
Use primitive type variables when you want speed
 */

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        int i = 5;
        Integer iObj = Integer.valueOf(i);      // Boxing
        Integer iObj2 = i;                      // Auto-boxing
        int iPrimitive = iObj.intValue();       // Unboxing
        int iPrimitive2 = iObj2;                // Auto-unboxing

        System.out.println(iPrimitive);
        System.out.println(iPrimitive2);

        ArrayList<Integer> values = new ArrayList<>();      // Wrapper classes are used with generics
        for(int q : values);                                // use primitve inside for-each for speed
    }
}
