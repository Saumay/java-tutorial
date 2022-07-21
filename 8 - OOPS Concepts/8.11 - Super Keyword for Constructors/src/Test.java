public class Test {
	public static void main(String[] args) {
		A a = new A();
		System.out.println();

		B b = new B();				// will implicitly call no argument constructor of A
		System.out.println();

		B b2 = new B(10.10);		// will implicitly call no argument constructor of A
		System.out.println();

		B b3 = new B(5);			// will call parametrized constructor of A first since super(i) is called
		System.out.println();
	}
}


class A {
	// Implicitly super() method is called while calling a constructor
	// For A, super() method will be called and Object's class constructor will be executed
	public A() {
		System.out.println("Inside A");
	}
	
	public A(int i) {
		System.out.println("Inside A int");
	}
}


class B extends A {
	
	public B() {
		System.out.println("Inside B");
	}

	public B(int i) {
		super(i);
		System.out.println("Inside B int");
	}

	public B(double d) {
		System.out.println("Inside B double");
	}
}
