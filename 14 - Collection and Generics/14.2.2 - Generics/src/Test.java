/*
One of the features of Java is 'type safety'.
Type Safety:
    - You have to declare the type of the variable before using it.
    - At compile time only, variable type is known
 */

import java.io.Serializable;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        // Testing our own Generic
        Container<Integer> obj = new Container<>();
        obj.value = 1;
        obj.show();

        // Container<int> obj = new Container<>();      // WRONG. You can only pass Class as generic, not primitive data types.

        ContainerNumber<Double> obj1 = new ContainerNumber<>();
        ContainerNumber<Integer> obj2 = new ContainerNumber<>();
        // ContainerNumber<Boolean> obj4 = new ContainerNumber<Boolean>();      // Invalid because Boolean doesn't extends Number class

        ContainerNumber<Number> obj3 = new ContainerNumber<>();
        obj3.demoExtends(new ArrayList<Number>());
        obj3.demoExtends(new ArrayList<Integer>());
        // obj3.demoExtends(new ArrayList<String>());                           // Invalid because String doesn't extends Number class
        obj3.demoSuper(new ArrayList<Number>());
        obj3.demoSuper(new ArrayList<Serializable>());
        obj3.demoSuper(new ArrayList<Object>());
        // obj3.demoSuper(new ArrayList<Integer>());                            // Invalid because Integer isn't a parent of Number class
    }
}

// Defining our own Generic
class Container<T> {
    public T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return this.value;
    }

    public void show() {
        System.out.println(value.getClass().getName());
    }
}

// extends: Will accept all classes including Number and it's children
class ContainerNumber<T extends Number>   {
    T value;

    // extends: Will accept all classes including Number and it's children
    public void demoExtends(ArrayList<? extends T > obj) {
    }

    // super: Will accept all classes including Number and it's parent
    public void demoSuper(ArrayList<? super T> obj) {
    }
}