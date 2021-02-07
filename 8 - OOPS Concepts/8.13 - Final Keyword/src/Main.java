/*
Usages of final keyword
	1) with a variable 	- no one can change the variables value
	2) with a method   	- no one can override the method
	3) with a class		- no one can inherit the class
*/
public class Main {

	public static void main(String[] args) {
		final int i = 5;
		// i = 10;				Will throw Compile Time Error
		System.out.println(i);

		System.out.println();

		final int j;
		j = 20;				 // Will assign the value as it's the first time
		// j = 30;				Will throw Compile Time Error
		System.out.println(j);
	}
}


class A {

	final public void show() {					// No class can override this method now
		System.out.println("In A show");
	}
}

final class B extends A {
	/*
	public void show() {		// Can't override method because show is final method
	}
	*/
}

/*
class C extends B { 			// Can't extend because B is final class
}
*/