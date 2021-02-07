/*
One of the features of Java is 'type safety'.
Type Safety:
    - You have to declare the type of the variable before using it.
    - At compile time only, variable type is known
 */

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
        obj3.demo(new ArrayList<Integer>());
    }
}

// Defining our own Generic
class Container<T>   {
    // Object value;        // Not type safe
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void show() {
        System.out.println(value.getClass().getName());
    }
}

// extends: Will accept all classes including Number and it's children
class ContainerNumber<T extends Number>   {
    T value;

    public void demo(ArrayList<? extends T > obj) {
    }
}

// super: will accept all classes including Integer and it's parents
class ContainerInteger<T extends > {

        }