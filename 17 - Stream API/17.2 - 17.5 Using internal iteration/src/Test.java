/*
Internal Iterations (loop inside the object)
    - forEach method

Consumer interface: Functional Interface

Till Java 1.7 : SAM(Single Abstract Method) interfaces
From Java 1.8 : Functional Interfaces
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5);

        // Printing values using internal iteration using forEach method

        // 1) by creating object of class implementing Consumer interface
        Consumer<Integer> consumer = new ConsumerImpl<>();
        values.forEach(consumer);

        System.out.println();

        // 2) using anonymous class implementing Consumer interface
        values.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        System.out.println();

        // 3) using lambda
        values.forEach((Integer i) -> System.out.println(i));

        System.out.println();

        // 4) Since we know it's going to be Integer, no use of typecasting
        values.forEach(value -> System.out.println(value));

        System.out.println();

        /*
         5) replacing lambda with method reference
            Method reference - passing method as an reference
            :: - denotes method reference
            obj::method - passing reference of method belonging to obj object
         */
        values.forEach(System.out::println);
    }
}

class ConsumerImpl<Integer> implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}