/*
In Java, we only had 'call by value'.
But in Java 1.8, 'call by method' was added.

Call by method:
    - passing a function to a function
 */

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> values = Arrays.asList("Navin", "Manoj", "Saumay");

        // Passing println method using method reference
        values.forEach(System.out::println);

        System.out.println();

        String str1 = "Saumay";
        String str2 = "Sa";
        MyPrinter mp = new MyPrinter();

        // Using anonymous class
        mp.print(str1, new Parser() {
            @Override
            public String parse(String str) {
                return StringParser.staticConvert(str);
            }
        });

        // Using lambda expressions
        mp.print(str1, str -> StringParser.staticConvert(str));


        // USING METHOD REFERENCE for custom method
        // For static methods, use class name
        mp.print(str1, StringParser::staticConvert);
        mp.print(str2, StringParser::staticConvert);

        // For instance methods, use object name
        StringParser sp = new StringParser();
        mp.print(str1, sp::instanceConvert);
        mp.print(str2, sp::instanceConvert);
    }
}

class MyPrinter {
    public void print(String str, Parser p) {
        System.out.println(p.parse(str));
    }
}

@FunctionalInterface
interface Parser {
    String parse(String str);
}

class StringParser {
    public static String staticConvert(String s) {
        if(s.length()<=3)
            s = s.toLowerCase();
        else
            s = s.toUpperCase();
        return s;
    }

    public String instanceConvert(String s) {
        if(s.length()<=3)
            s = s.toLowerCase();
        else
            s = s.toUpperCase();
        return s;
    }
}
