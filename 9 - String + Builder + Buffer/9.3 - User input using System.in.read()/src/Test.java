/*
Ways to take user input
    - Scanner
    - BufferedReader
    - System.in.read()
        - returns byte value in the form of int in range 0 to 255
        - that value is basically the ascii value of that character
        - not efficient
*/

public class Test {
    public static void main(String[] args) throws Exception {
        int i = System.in.read();       // returns ascii value of the next character in int format
        System.out.println(i);
        System.out.println((char)i);

        // for reading multiple values
        //      - loop required
        //      - a delimiter required at the end
        String str = "";
        while ((i = System.in.read()) != 48)
            str += (char)i;
        System.out.println(str);
    }
}
