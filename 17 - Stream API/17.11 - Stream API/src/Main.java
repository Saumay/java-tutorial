/*
Advantage of using forEach with Stream API instead of using normally:
    - parallel streams can be used
    - better while processing huge amount of data
    - stream API provides number of methods like filter() and map()
    - a stream will only be processed once, while forEach can be run multiple times on list

Stream API:
    - Types of Methods:
        - intermediate methods  : Like filter(), map()
        - terminate methods : findFirst(), findAny(), collect(), orElse()
    - Once stream is used, you cannot reuse it
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        for(int i=1;i<5;i++) {
            values.add(i);
        }

        // 1) Using traditional for-each
        for(int value : values) {
            System.out.println(value);
        }

        System.out.println();

        // 2) Using lambda expressions with method reference
        values.forEach(System.out::println);

        System.out.println();

        // 3) Using forEach with Stream API
        values.stream().forEach(System.out::println);

        System.out.println();

        // 4) Using forEach with parallelStream method of Stream API
        //      - Multiple threads will be created for the function specified
        values.parallelStream().forEach(System.out::println);       // will print in unordered form

        System.out.println();

        // 5) Using other methods of stream
        System.out.println(values.stream().filter(i -> {
            System.out.println(i);
            return true;
        }).findFirst());

        System.out.println();

        // 6) Using same stream multiple times - Not allowed
        Stream<Integer> s = values.stream();
        s.forEach(System.out::println);
        s.forEach(System.out::println);         // will throw IllegalStateException
    }
}
