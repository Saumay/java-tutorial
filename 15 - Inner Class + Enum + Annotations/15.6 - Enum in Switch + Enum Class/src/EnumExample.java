/*
Enums can be used inside switch case

Let's see what happens internally behind the scenes
    - Compiler creates class named Mobile
    - creates all the variables of enum as static final objects

        class Mobile {
            static final Mobile APPLE = new Mobile();
            static final Mobile SAMSUNG = new Mobile();
            static final Mobile HTC = new Mobile();
        }
    - Every enum in java extends Enum class, which is an abstract class
    - We can't make enum extend any other class, but it can implement interface

Since, enums are converted into class, we can have method also in an enum.
*/

import java.lang.Enum;          // all the enum extends this Enum class

public class EnumExample {

    Enum enu;                   // Parent class of all enums

    public static void main(String[] args) {
        Mobile m = Mobile.SAMSUNG;

        System.out.println();

        switch (m) {
            case APPLE:
                System.out.println("Apple is best");
                break;
            case SAMSUNG:
                System.out.println("Samsung is here");
                break;
            default:
                System.out.println("HTC is also here");
        }

        System.out.println();

        // Accessing methods of enum
        System.out.println(Mobile.APPLE.getPrice());
        System.out.println(Mobile.SAMSUNG.getPrice());
        System.out.println(Mobile.HTC.getPrice());

        // There are other methods as well
        // - Printing ordinal
        System.out.println(Mobile.APPLE.ordinal());
        System.out.println(Mobile.SAMSUNG.ordinal());
        System.out.println(Mobile.HTC.ordinal());

        // - Accessing all the Mobile objects using values(). Since they are ordered, they can be returned in an array.
        Mobile mobiles[] = Mobile.values();     // values() method isn't present anywhere. Not even in Enum class. Provided by compiler
        for(Mobile mobile : mobiles) {
            System.out.println(mobile);
        }
    }
}

enum Mobile {
    APPLE(100), SAMSUNG(50), HTC;        // are actually objects
    private int price;

    Mobile() {
        this.price = 10;
        System.out.println("Default constructor");
    }
    Mobile(int price) {
        this.price = price;
        System.out.println("Parameterized constructor");
    }

    public int getPrice() {
        return price;
    }
}

/*
Enum can't extend any other class
enum Sample extends Object {
}
 */

/*
Enum can implement interface though
 */
interface Sample {}
enum SampleEnum implements Sample {}