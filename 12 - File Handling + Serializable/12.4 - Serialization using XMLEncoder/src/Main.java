import java.beans.XMLEncoder;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * <b>Serialization</b> : storing the state of the object
 * <br><br>
 * <b>Problem with storing the object in file:</b><br>
 * If between serialization and deserialization, class definition is changed, object won't be parsed.
 *<p>
 *     Using XML Encoder, you can actually see the data stored in file.
 *</p>
 */

public class Main {
    private static final File XML_FILE = new File("12 - File Handling + Serializable/12.4 - Serialization using XMLEncoder/src/obj.txt");

    public static void main(String[] args) throws FileNotFoundException {
        // Setting values in college object
        Student st1 = new Student();
        st1.setRollNo(1);
        st1.setSname("Amol");

        Student st2 = new Student();
        st2.setRollNo(2);
        st2.setSname("Bharath");

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);

        College c = new College();
        c.setStudents(students);

        // Using encoder for serializing
        XMLEncoder x = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(XML_FILE)));
        x.writeObject(c);
        x.close();
    }
}

class College implements Serializable {
    College() {
    }

    public List<Student> students;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }
}

class Student implements Serializable {
    Student() {
    }

    private int rollNo;
    private String sname;

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }
}
