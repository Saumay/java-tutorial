// toString method : returns ClassName with package + @ + hashcode

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(123, "SMY");
        System.out.println(s1.rollNo);
        System.out.println(s1.name);
        System.out.println(s1);                 // will implicitly call toString method present in Object class which is extended by Student class
        System.out.println(s1.toString());

        System.out.println();

        // StudentChild class has overriden toString method
        StudentChild sc1 = new StudentChild(123, "SMY");
        System.out.println(sc1.rollNo);
        System.out.println(sc1.name);
        System.out.println(sc1);
        System.out.println(sc1.toString());
    }
}

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class StudentChild extends  Student {

    StudentChild(int rollNo, String name) {
        super(rollNo, name);
    }

    @Override
    public String toString() {
        return rollNo + " " + name;
    }
}