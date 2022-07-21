public class Test {
	public static void main(String[] args) {
		A a = new A();			// Will call 1st constructor (without parameters)
		A a2 = new A(5);		// Will call 2nd constructor (with int parameter)
		A a3 = new A(5.0);	// Will call 3rd constructor (with double parameter)

		B b = new B();			// Will call 1st constructor (without parameters)
		B b2 = new B(5);		// Should call int constructor. But since int constructor isn't present, will call double constructor (Implicit conversion to double because double can store int.
		// But converse can't happen because int can't store double).
	}
}

class A {
	int i;
	float f;
	
	// Even if we don't mention it, there is a constructor in every class.
	public A() {
		System.out.println("Inside Constructor without parameters: A()");
	}
	
	// Construtor overloading
	public A(int k) {
		System.out.println("Inside: A(int k)");
	}	
	
	public A(double k) {
		System.out.println("Inside: A(double k)");
	}
}

class B
{
	B() {
	}

	/*
	public B(int k)
	{
		System.out.println("Inside: B(int k)");
	}
	*/
	
	public B(double k) {
		System.out.println("Inside: B(double k)");
	}
}

/*
Constructor : 
		1) a member method
		2) will have same name as class name
		3) doesn't return anything
		4) Even if we don't define any constructor, there will be a constructor inside the class(default constructor)
 Imp:	5) Use: to allocate memory to the object
		6) can be used to intialize the values
		7) Constructor is called everytime when an object is created
 Imp:	8) Multiple constructors are allowed (constructor overloading)
 Imp:	9) Once we have manually defined a constructor, default constructor i.e. A() also needs to be defined manually. It won't be called implicitly now.
*/
