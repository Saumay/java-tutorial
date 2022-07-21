/*
Object Oriented Programming:
    - Till Java 1.7
    - focus on how to do
    - focus on what to do

Functional Programming was introduced:
    - From Java 1.8
    - just focus on what to do

Ways to print values of a list:
    External Iterations (loop outside the object)
        - for loop
        - while loop using iterator
        - for each loop
    Internal Iterations (loop inside the object)
        - forEach method
 */

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5);

        // Printing values using external iterations
        // 1) Using for loop
        for(int i=0;i<values.size();i++) {
            System.out.println(values.get(i));
        }

        System.out.println();

        // 2) Using Iterator with while loop
        Iterator<Integer> iterator = values.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println();

        // 3) Using enhanced for loop
        for(int value : values) {
            System.out.println(value);
        }
    }
}
