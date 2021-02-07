// this keyword : refers to current instance
public class Main {
	public static void main(String[] args) {
		A a = new A(5);
		a.show();
	}
}


class A {
	
	private int x;			// x = class variable
	
	public A(int x) {		// x = local variable
		// x = x;			// will assign value to x itself
		this.x = x;			// will assign value to class variable x
	}
	
	public void show() {
		System.out.println("In A show; x = " + x);
	}
}