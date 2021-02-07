public class StaticDemo {
	public static void main(String[] args) {
		A.num2 = 10;
		
		A obj1 = new A();
		A obj2 = new A();
		A obj3 = new A();
		
		obj1.num1 = 1;
		System.out.println("O1: Num 1="+obj1.num1 + " Num 2="+obj1.num2);
		System.out.println("O2: Num 1="+obj2.num1 + " Num 2="+obj2.num2);
		System.out.println("O3: Num 1="+obj3.num1 + " Num 2="+obj3.num2);
		System.out.println();
		
		obj2.num1 = 2;
		obj2.num2 = 20;			// we changed static variable only for obj2, but it will be reflected on all other objects also.
		System.out.println("O1: Num 1="+obj1.num1 + " Num 2="+obj1.num2);
		System.out.println("O2: Num 1="+obj2.num1 + " Num 2="+obj2.num2);
		System.out.println("O3: Num 1="+obj3.num1 + " Num 2="+obj3.num2);
		System.out.println();

		obj3.num1 = 3;
		obj3.num2 = 30;
		System.out.println("O1: Num 1="+obj1.num1 + " Num 2="+obj1.num2);
		System.out.println("O2: Num 1="+obj2.num1 + " Num 2="+obj2.num2);
		System.out.println("O3: Num 1="+obj3.num1 + " Num 2="+obj3.num2);
		System.out.println();
		
		obj1.show();
		System.out.println("O1: Num 1="+obj1.num1 + " Num 2="+obj1.num2);
		System.out.println("O2: Num 1="+obj2.num1 + " Num 2="+obj2.num2);
		System.out.println("O3: Num 1="+obj3.num1 + " Num 2="+obj3.num2);
		System.out.println();
	}
}

class A {
	int num1;
	static int num2;
	public void show() {
		num2 = 40;
	}
}

/*
Static keyword properties:
	1 - Object creation is not required for calling a static method
	2 - Static variable/method is shared between all the instances of that class. Modifying static variables for one instance will modify for other instances as well.
	3 - Static methods/variables can be accessed using object as well
	4- Static method CAN'T directly access non static variable
	5 - Non static method CAN directly access static variable
*/
	