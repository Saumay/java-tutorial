/**
 * @Serialization : storing the state of the object
 *
 * To clone an object: One way is to first write an object to a file and then read it back
 * But, allowing to save an object can be used for malicious purposes. That's why class of whose object is being saved
 * needs to implement {@code Serializable} interface(a marker interface).
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Test {

    private static final File FILE = new File("12 - File Handling + Serializable/12.3 - Object Serialization/src/obj.txt");

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Save obj = new Save();
        obj.i = 4;

        // Saving object to a file          - SERIALIZATION
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE));
        oos.writeObject(obj);

        // Retrieving object from a file    - DESERIALIZATION
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE));
        Save obj_retrieved = (Save) ois.readObject();

        System.out.println(obj_retrieved.i);
    }
}

class Save implements Serializable {
    int i;
}
