/*
Why published interface should not be modified?
    - If any method is introduced later(after publication) in interface, your implemented classes which do not have that method will not work.
      So, you would have to then modify all those tasks, which is very difficult and costly.

Solution: From Java 1.8
    - default keyword (added in Java 1.8)
 */

public class Test {
    public static void main(String[] args) {
        Actor hero = new Hero();
        hero.act();
        hero.speak();
        hero.comedy();

        System.out.println();

        Actor villain = new Villain();
        villain.act();
        villain.speak();
        villain.comedy();
    }
}

// All methods in an interface are public
interface Actor {
    void act();
    void speak();

    // void comedy();       // If this method is introduced later(after publication), your implemented classes might not work

    default void comedy() {
        System.out.println("Comedy");
    }
}

class Hero implements Actor {
    public void act() {
        System.out.println("Hero Act");
    }
    public void speak() {
        System.out.println("Hero Speak");
    }
    public void comedy() {
        System.out.println("Hero Comedy");
    }
}

class Villain implements Actor {
    public void act() {
        System.out.println("Villain Act");
    }
    public void speak() {
        System.out.println("Villain Speak");
    }
}
