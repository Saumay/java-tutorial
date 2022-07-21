import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    private static final File FILE = new File("12 - File Handling + Serializable/12.1 - File Handling Example/src/demo.txt");

    public static void main(String[] args) throws IOException {

        // Writing content to a file
        DataOutputStream dos = new DataOutputStream(new FileOutputStream(FILE));    // can pass fileName as well in constructor
        dos.writeUTF("Demo Content");

        // Reading contents from a file
        DataInputStream dis = new DataInputStream(new FileInputStream(FILE));       // can pass fileName as well in constructor
        String str = dis.readUTF();
        System.out.println(str);
    }
}
