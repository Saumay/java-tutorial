/*
.stream() - method introduced in Collection framework
 */

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);

        /* Using method reference
           Syntax:
              - obj::method
         */
        values.forEach(System.out::println);

        System.out.println();

        // Using custom method reference
        values.forEach(Test::doubleIt);

    }

    public static void doubleIt(int i) {
        System.out.println(i*2);
    }
}
