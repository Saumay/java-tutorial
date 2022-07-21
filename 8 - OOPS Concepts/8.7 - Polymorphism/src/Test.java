public class Main {
	public static void main(String[] args) {
		System.out.println("Method Overloading");
		A a = new A();
		a.show();
		a.show(2);
		a.show(2.5);

		System.out.println();

		System.out.println("Method Overriding");
		B b = new B();
		b.show();		// will call show of B class (METHOD OVERRIDING)
	}
}


class A {
	
	/*
	Polymorphism
	Poly = Many
	Morphism = behaviour
	
	Polymorphism = something that exhibits multiple behaviour
	Two main concepts in Polymorphism:
		1) Method Overloading / Early binding / Static binding / Compile time polymorphism
		2) Method Overriding / Late binding / Dynamic binding / Run time polymorphism
	*/
	
	public void show() {
		System.out.println("Inside A show");
	}
	
	public void show(int i) {
		System.out.println("Inside A show int");
	}
	
	public void show(double i) {
		System.out.println("Inside A show double");
	}
	// This concept of having same method name with different parameters is called METHOD OVERLOADING.
}


class B extends A {

	// Method Overriding: Till you don't get your own method, you use your parent's methods
	public void show() {
		System.out.println("Inside B show");
	}
}