class Test {
	public static void main(String[] args) {
		printCounter();
		A obj1 = new A();
		printCounter();
		A obj2 = new A();
		printCounter();
		A obj3 = new A();
		printCounter();
	}

	static void printCounter() {
		System.out.println("Number of objects created till now = "+A.getCount());
	}
}


class A {
	private static int count;
	
	A() {
		count++;				// increasing static variable count everytime an object is created
	}
	
	static int getCount() {
		return count;
	}
}
