public class ObjectCreation {
	
	public static void main(String[] args) {
		A a = new A();
		System.out.println();
		B b = new B();
		System.out.println();
		B b2 = new B(5);
		System.out.println();
		
		// We can also have reference of parent and object of child
		A ab = new B();
		System.out.println();
		A ab2 = new B(5);
		System.out.println();
	}
}

class A {
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
		/*
		will still call default constructor of A class
		for calling parametrized constuctor, use
		
		super(i)
		*/
		System.out.println("Inside B int");
	}
}

/*
While calling constructor of subclass, the DEFAULT constructor of super class will be called implicitly.
	- While calling B constructor, DEFAULT constructor of A will also be called implicitly.
*/