/*
Write program which accepts 2 strings to do these:
    1) Find out length of both strings
    2) Concatenate s1 and s2
    3) Convert first string to uppercase
*/

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        System.out.println("s1 length: " + s1.length());
        System.out.println("s2 length: " + s2.length());

        System.out.println();

        /* Ways to concatenate the string
        1) Using concat method
        */
        /** The value is used for character storage. */
        String s3 = s1.concat(s2);
        System.out.println("Concatenated string: " + s3);

        // 2) Using + operator
        String s4 = s1 + s2;
        System.out.println("Concatenated string: " + s4);

        System.out.println();

        System.out.println(s1.toUpperCase());
    }
}
