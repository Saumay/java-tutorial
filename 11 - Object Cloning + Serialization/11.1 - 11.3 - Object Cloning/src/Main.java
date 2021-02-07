/**
 * Ways of copying an object:
 * <ul>
 *     <li>Shallow copy : Single object, multiple references</li>
 *     <li>Deep copy</li>
 *     <li>Using {@code Cloneable} interface:
 *          <ul>
 *              <li>Object class has clone method but it's protected. So, it needs to be overrided.</li>
 *              <li>Class for which clone is being created needs to implement {@code Cloneable} interface(Marker interface basically allowing permission to clone object of that class)</li>
 *              <li>To increase security and have permission of class writer, cloneable interface is implemented</li>
 *          </ul></li>
 *     <li>By storing the current object in a file and then reading it back</li>
 * </ul>
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        A obj1 = new A();
        obj1.i = 5;
        obj1.j = 6;
        System.out.println(obj1);

        System.out.println("\nShallow copy:");

        // 1) Shallow copy
        A obj2 = obj1;                   // SHALLOW COPY: will point to the same object only
        obj2.i = 7;
        System.out.println(obj1);        // value will be modified for obj1 also because both are pointing to the same object
        System.out.println(obj2);

        System.out.println("\nDeep copy:");

        // 2) Deep copy
        A obj3 = new A();
        obj3.i = obj1.i;                 // DEEP COPY: New object is created with same values
        obj3.j = obj1.j;                 // can be tedious for huge objects
        obj3.j = 10;
        System.out.println(obj1);
        System.out.println(obj3);

        System.out.println("\nUsing clonable interface:");

        // 3) Using Clonable Interface
        A obj4 = (A)obj1.clone();
        obj4.i = 1;
        System.out.println(obj1);
        System.out.println(obj4);
    }
}


class A implements Cloneable {
    int i;
    int j;

    @Override
    public String toString() {
        return "A{i = " + this.i + ", j = " + this.j + "}";
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
