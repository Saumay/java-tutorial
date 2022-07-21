import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Rahul");
        names.add("Mangesh");
        names.add("Rahul");
        names.add("Mangesh");

        names.forEach(System.out::println);

        System.out.println();

        // We have to print only duplicate elements
        Set<String> s = new HashSet<>();
        for(String name : names) {
            if(!s.add(name)) {
                System.out.println(name);
            }
        }
    }
}
