import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        /* List interface is in Java since 1.2.
           But forEach method was introduced in Java 1.8 in Iterable interface which is grandfather of List.
           Since we know that published interfaces should not be modified, how was this interface modified?

           How?
                - Using default method
                - forEach is defined as a default method in Iterable interface

           Class Hierarchy:
                Iterable
                |___Collection
                    |___List
                        |___ArrayList
         */

        values.forEach(System.out::println);
    }
}
