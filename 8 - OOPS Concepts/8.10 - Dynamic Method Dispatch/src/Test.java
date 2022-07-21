public class Test {

	public static void main(String[] args) {
		System.out.println("Method Overriding");
		B b = new B();
		b.show();			// will call show of B class (METHOD OVERRIDING)

		System.out.println();
		A ab = new B();
		ab.show();			// will still call show of B class (METHOD OVERRIDING with DYNAMIC METHOD DISPATCH)
		// ab.mine();		// will throw compile time error because reference of A doesn't know anything about mine method

		/* Dynamic Method Dispatch
			Very useful while writing industry grade code
			You can create reference of parent class, and use that for calling method of all the child classes
		*/
	}
}


class A {
	
	public void show() {
		System.out.println("Inside A show");
	}
}


class B extends A{
	
	public void show() {
		System.out.println("Inside B show");
	}
	
	public void mine() {
		System.out.println("Inside B mine");
	}
}
