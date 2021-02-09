import java.beans.XMLDecoder;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.List;

public class Main {
    private static final File XML_FILE = new File("12 - File Handling + Serializable/12.4 - Serialization using XMLEncoder/src/obj.txt");

    public static void main(String[] args) throws FileNotFoundException {
        try {
            XMLDecoder x = new XMLDecoder(new BufferedInputStream(new FileInputStream(XML_FILE)));
            College c = (College)x.readObject();
            List<Student> s = c.getStudents();

            for (Student value : s) {
                System.out.println(value);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
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

    @Override
    public String toString() {
        return "Student{" + "rollNo=" + rollNo + ", sname=" + sname + '}';
    }
}