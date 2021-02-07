/*
Set:
    - Only contains unique elements
    HashSet:
        - unordered
    TreeSet:
        - stores values in ascending order
    LinkedHashSet:
        - stores values in insertion order
 */

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        // HashSet
        Set<Integer> values = new HashSet<>();
        values.add(5);
        values.add(10);
        values.add(5);
        values.add(6);
        System.out.println(values.add(7));      // add returns boolean values - whether values has been added to Set or not
        System.out.println(values.add(5));      // add returns boolean values - whether values has been added to Set or not

        values.forEach(System.out::println);

        System.out.println();

        // TreeSet
        Set<Integer> values2 = new TreeSet<>();
        values2.add(5);
        values2.add(4);
        values2.add(5);
        values2.add(6);
        System.out.println(values2.add(7));      // add returns boolean values - whether values has been added to Set or not
        System.out.println(values2.add(5));      // add returns boolean values - whether values has been added to Set or not

        values2.forEach(System.out::println);
    }
}
