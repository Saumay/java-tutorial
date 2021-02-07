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
}

public class Main {

	public static void main(String[] args) {
		A a = new A();
		System.out.println();
		B b = new B();
		System.out.println();
		B b2 = new B(5);			// will call parametrized constructor of A since super(i) is called
		System.out.println();
	}
}