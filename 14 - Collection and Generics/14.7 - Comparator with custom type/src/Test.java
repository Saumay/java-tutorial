/*
 Comparator interface:
    - For providing custom logic for sorting values in a list
    - Object passed as a parameter to Collections.sort method
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

        // Sorting on the basis of marks
        Collections.sort(students, (s1, s2) -> s1.marks > s2.marks ? 1 : -1);

        students.forEach(System.out::println);
    }
}

class Student {
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
}