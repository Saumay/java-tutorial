/*
External Iterations: (Normal loop)
    - focus on how to do
    - focus on what to do

Internal Iterations: (Stream API)
    - just focus on what to do
 */

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(1,2,3,4,5);

        // We need to find the sum of all the values*2

        int result = 0;
        // 1) Using traditional for-each loop
        for (int value : values) {
            result += value*2;
        }
        System.out.println(result);

        System.out.println();

        /*
        2) Using Stream API:
            Mutation is happening in traditional scenario since value of result is continuously changing after each iteration.
            Mutation makes system slow because concurrency is not achieved.

            Number of mutations are less while using Streams.
         */
        Function<Integer, Integer> func = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i*2;
            }
        };
        Stream s = values.stream();
        Stream s1 = s.map(func);

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer i1, Integer i2) {
                return i1+i2;
            }
        };
        Integer result2 = (Integer) s1.reduce(0, binaryOperator);
        System.out.println(result2);

        System.out.println();

        // 3) Doing above all computation in a clean way(In a single line).
        int result3 = values.stream().map(i -> i*2).reduce(0, (i,j) -> i+j);
        System.out.println(result3);

        System.out.println();

        // 4) Using sum method of Integer class as method reference
        int result4 = values.stream().map(i -> i*2).reduce(0, Integer::sum);    // (0, (i,j) -> Integer.sum(i,j))
        System.out.println(result4);
    }
}
