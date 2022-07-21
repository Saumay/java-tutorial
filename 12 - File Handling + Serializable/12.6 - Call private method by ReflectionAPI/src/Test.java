import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <b>Reflection API</b>: To call a private method outside of that class.<br>
 * Normally used for debugging purpose for testing methods.
 */

public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException,
            InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c = Class.forName("TestClass");
        TestClass t = (TestClass)c.newInstance();

        Method m = c.getDeclaredMethod("show", null);
        m.setAccessible(true);
        m.invoke(t, null);
    }
}

class TestClass {
    // private method: Can't be called from outside the class
    private void show() {
        System.out.println("In show");
    }
}
