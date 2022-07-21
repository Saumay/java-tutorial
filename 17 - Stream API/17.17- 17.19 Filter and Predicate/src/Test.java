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
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68);

        // We need to print the sum of numbers divisible by 5

        // 1) Using traditional approach (External iteration)
        int result = 0;
        for(Integer value : values) {
            if(value%5==0)
                result += value;
        }
        System.out.println(result);

        System.out.println();


        // 2) Using Stream API
        Predicate<Integer> predicate = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer%5==0;
            }
        };
        Stream s1 = values.stream();
        Stream s2 = s1.filter(predicate);

        BinaryOperator<Integer> binaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer + integer2;
            }
        };
        Integer result2 = (Integer) s2.reduce(0, binaryOperator);
        System.out.println(result2);

        System.out.println();


        // 3) Using Stream API, but in single line (cleaner code)
        int result3 = values.stream().filter(i -> i%5==0).reduce(0, (c,e) -> Integer.sum(c,e));
        System.out.println(result3);

        System.out.println();

        // 4) Using Stream API, but using method reference for sum method
        int result4 = values.stream()
                .filter(i -> i%5==0)
                .reduce(0, Integer::sum);
        System.out.println(result4);

        System.out.println();


        // OPTIONAL
        // Custom problem : Find first element instead of sum
        int firstElement = values.stream()
                .filter(i -> i%5==0)
                .findFirst()
                .orElse(0);
        System.out.println(firstElement);
    }
}
