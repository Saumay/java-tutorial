// We can't use perform many operations using collection reference like deleting or adding in between. For that, we would have to use List interface.

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Using Collection interface
        Collection<Integer> values = new ArrayList<>();
        values.add(3);
        values.add(5);
        values.add(1);
        values.forEach(System.out::println);

        System.out.println();

        // Using List interface
        List<Integer> valuesList = new ArrayList<>();
        valuesList.add(30);
        valuesList.add(50);
        valuesList.add(10);
        valuesList.add(1, 90);        // This method is not present in Collection interface

        // Collections.sort(values);               // sort only takes list as parameter, and not collection
        Collections.sort(valuesList);
        valuesList.forEach(System.out::println);
    }
}
