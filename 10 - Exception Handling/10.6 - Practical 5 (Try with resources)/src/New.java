// Can only be used in Java 1.7 or later

import java.io.*;

class New
{
    public static void main(String[] args) {
        // Code for doing same thing since Java 1.7 and later
        // Create resource inside try parenthesis
        // Java will handle the error and will close the resource itself
        // Can be used for sockets, files, databases etc.
        try(BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))) {
            String str = br2.readLine();
            System.out.println(str);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}