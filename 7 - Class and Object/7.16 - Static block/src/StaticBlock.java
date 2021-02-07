class StaticBlock {
	
	static int i;
	static {
		System.out.println("Hello World in Static 1");
	}
	static {
		System.out.println("Hello World in Static 2");
		i = 5;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World in Main");
		System.out.println("i = " + i);
	}
}

/*
Static block is executed as soon as class is loaded into JVM.
Will run even before main method.
Static block is generally used to initalize static variables
*/