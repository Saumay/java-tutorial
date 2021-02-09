/*
Before Java 1.5, interfaces were being used, instead of Enums
But, we won't know what is the type of variable in that case

Enum:
    - added in Java 1.5
    - Different from enums in C and C++
    - Used to represent constants

Difference from Enum of C and C++:
    - Enum can be defined inside class also in Java
    - Since, enums are converted into class, we can have methods and variables also in an enum in Java
 */

public class EnumExample {
    public static void main(String[] args) {
        // We don't know whether MobileCompany.APPLE will return Integer or String
        if(MobileCompany.APPLE == "Apple") {        // to use == or .equals?
            System.out.println(MobileCompany.APPLE);
        }

        // Using enums
        System.out.println(Mobile.APPLE);
        System.out.println(Mobile.SAMSUNG);

        // Using enum defined inside same class
        System.out.println(Fruits.MANGO);
        System.out.println(Fruits.ORANGE);

        // Using enum defined inside another class
        System.out.println(A.Cars.MERCEDES);
        System.out.println(A.Cars.TESLA);
    }

    enum Fruits {
        MANGO, ORANGE;
    }
}

interface MobileCompany {
    static String APPLE = "Apple";         // final by default
    static String SAMSUNG = "Samsung";     // final by default
}

enum Mobile {
    APPLE, SAMSUNG;
}

class A {
    enum Cars {
        TESLA, MERCEDES;
    }
}