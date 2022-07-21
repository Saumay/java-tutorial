public class Main {

	public static void main(String[] args) {
		A a = new A();
		a.show();

		System.out.println();

		B b = new B();
		b.show();

		System.out.println();

		b.showModifiedIForA();
	}
}


class A {

	int i = 5;
	public void show() {
		System.out.println("Inside A; i = " + i);
	}
}


class B extends A {
	
	int i = 10;
	public void show() {
		System.out.println("Inside B; B's i = " + i);
		System.out.println("Inside B; A's i = " + super.i);		// super keyword can be used to access variables and methods of parent class
		super.show();											// can also call A's show method using super
	}
	
	public void showModifiedIForA() {
		super.show();
		super.i = 15;
		super.show();
	}
}