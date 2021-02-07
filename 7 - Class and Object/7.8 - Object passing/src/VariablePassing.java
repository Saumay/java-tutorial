// If we pass a variable to a method and then change it's value inside the method. Changes in the value won't be reflected.

public class VariablePassing {
    VariablePassing() {
    }

    public static void main(String[] var0) {
        byte var1 = 10;
        modify(Integer.valueOf(var1));
        System.out.println("i = " + var1);

        Integer var2 = 10;
        modify(var2);
        System.out.println("i = " + var2);

        Integer var3 = new Integer(10);
        System.out.println("i = " + var3);
    }

    static void modify(Integer var0) {
        System.out.println("Inside modify(Integer i)");
        var0 = 6;
    }
}
