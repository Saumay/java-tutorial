class InheritanceMain {
	public static void main(String[] args) {
		A obj = new A();
		
		obj.method_1();
		obj.method_2();
	}
}

class A {
	method_1() {
	}
}

// We need A class to have method_2 also now. But we can't make any change to that class, because it's created by someone else.

class B extends A {
	method_2() {
	}
}

/*
Parent-child relationship
Child inherits all the NON-PRIVATE members.

Type of inheritance:
1) Single level
2) Multi level
3) Multiple			--> Not supported in Java
	- Reason why Multiple inheritance is not supported
		- It will create the diamond problem
		- If a class extends 2 classes which contain same method, compiler won't be able to decide which method to call.
		  So, to avoid this ambiguity, multiple inheritance is avoided in Java.

Parent/Super/Base Class
		^
		|
		|
		|
Child/Sub/Derived Class
*/