import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

/**
 * {@code Properties} file: is used to store configuration
 */

public class Test {

    private static final File PROPERTIES_FILE = new File("12 - File Handling + Serializable/12.2 - Properties file/src/config.properties");

    public static void main(String[] args) throws IOException {

        // Store data in a properties file
        Properties p = new Properties();
        p.setProperty("url", "localhost:8079/myDb");
        p.setProperty("uname", "Saumay");
        p.setProperty("pass", "1111");

        OutputStream os = new FileOutputStream(PROPERTIES_FILE);
        p.store(os, null);

        // Retrieve data from a properties file
        Properties p2 = new Properties();
        InputStream is = new FileInputStream(PROPERTIES_FILE);
        p2.load(is);
        System.out.println(p2.getProperty("url"));
        System.out.println(p2.getProperty(""));
        System.out.println(p2.getProperty("invalid"));
    }
}
