/*
 Comparable interface:
    - For providing custom logic for sorting values in a list
    - By making the class implement Comparable interface and defining comparison logic by overriding compareTo method in the class itself
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, 55));
        students.add(new Student(2, 70));
        students.add(new Student(3, 65));
        students.add(new Student(4, 90));

        students.forEach(System.out::println);
        System.out.println();
        
        Collections.sort(students);

        students.forEach(System.out::println);

    }
}

class Student implements Comparable<Student> {      // Using generic because we know because it's only being used for Student class
    int rollNo;
    int marks;

    public Student(int rollNo, int marks) {
        this.rollNo = rollNo;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return "rollNo: " + rollNo + " marks:" + marks;
    }

    @Override
    public int compareTo(Student s2) {
        return this.marks > s2.marks ? 1 : -1;
    }
}
