/*
For BufferedReader, you need to specify 3 things first
1) WHAT data you are getting?
2) FROM where you are getting it
3) HOW you are getting it

BufferedReader
    - Required object of InputStreamReader
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);

        String s = br.readLine();       // can read in String format
        System.out.println(s);

        BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in));      // More efficient (inline)
    }
}
