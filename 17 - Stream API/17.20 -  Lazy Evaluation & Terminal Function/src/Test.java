import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> values = Arrays.asList(12, 20, 35, 46, 55, 68);

        // Find twice of first element which is divisible by 5

        // 1) Using traditional method
        int result = 0;
        for(int i : values) {
            if(i%5==0) {
                result = i*2;
                break;
            }
        }
        System.out.println(result);

        System.out.println();

        // 2) Using Stream API
        int result2 = values.stream()
                .filter(i -> i%5==0)
                .map(i -> i*2)
                .findFirst()
                .orElse(0);
        System.out.println(result2);

        System.out.println();
        /*
        On first look, it seems like
            Number of iterations using traditional method = 2
            Number of iterations using Stream API = n

        But that should not be the case since Stream API was designed to be more efficient.
        In fact, it is.

        Stream methods like map and filter does 'lazy evaluation'.
        It means that they won't compute the whole list first.
        They will first check the terminal method(in this case findFirst), and will execute accordingly.

        Lazy Evaluation:
            - won't evaluate beforehand
            - If terminal method is present, will check for what it needs and will then execute accordingly

        Terminal Methods: findFirst(), findAny(), reduce(), max(), min(), collect() etc.

         Proving lazy evaluation using below example.
         */
        int result3 = values.stream()
                .filter(Main::isDivisible)
                .map(Main::mapDouble)
                .findFirst()
                .orElse(0);
        System.out.println(result3);
    }

    public static boolean isDivisible(int i) {
        System.out.println("isDivisible : " + i);
        return i%5==0;
    }

    public static int mapDouble(int i) {
        System.out.println("mapDouble : " + i);
        return i*2;
    }
}
