// System.currentTimeMillis() : used to calculate time taken by a method to execute

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Calculating time taken to add 1000000 elements in the ArrayList
        long start = System.currentTimeMillis();
        ArrayList a = new ArrayList();
        for(int i=0;i<1000000;i++) {
            a.add(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);

        System.out.println(System.currentTimeMillis());     // Number of miliseconds from Jan 1, 1970

    }
}
