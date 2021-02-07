// Comparator interface: For providing custom logic for sorting values in a list

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1) sort values normally
        List<Integer> values = new ArrayList<>();
        values.add(101);
        values.add(505);
        values.add(703);

        Collections.sort(values);
        values.forEach(System.out::println);

        System.out.println();


        // 2) Sort values based on custom condition
        Comparator<Integer> comparator = new ComImpl();
        Collections.sort(values, comparator);

        values.forEach(System.out::println);


        // 3) Using anonymous class instead of creating new class
        Comparator<Integer> comparator2 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10 > o2%10)
                    return 1;
                else if(o1%10 < o2%10)
                    return -1;
                else
                    return 0;
            }
        };
        Collections.sort(values, comparator2);


        // 4) Using lambda instead of anonymous class
        Comparator<Integer> comparator3 = (o1, o2) -> {
            if(o1%10 > o2%10)
                return 1;
            else if(o1%10 < o2%10)
                return -1;
            else
                return 0;
        };
        Collections.sort(values, comparator3);
    }
}

class ComImpl implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {        // Logic for sorting based on last digit
        if(o1%10 > o2%10)
            return 1;
        else if(o1%10 < o2%10)
            return -1;
        else
            return 0;
    }
}
