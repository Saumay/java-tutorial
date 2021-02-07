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

        Consumer<Integer> consumer = new ConsumerImpl<>();  // 1) by creating object of class implementing Consumer interface
        values.forEach(consumer);

        System.out.println();

        values.forEach(new Consumer<Integer>() {            // 2) using anonymous class implementing Consumer interface
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        });

        System.out.println();

        values.forEach((Integer i) -> System.out.println(i));// 3) using lambda

        System.out.println();

        values.forEach(value -> System.out.println(value)); // 4) Since we know it's going to be Integer, no use of typecasting

        System.out.println();

        values.forEach(System.out::println);                // 5) replacing lambda with method reference
    }
}

class ConsumerImpl<Integer> implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }
}