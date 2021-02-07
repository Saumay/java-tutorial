public class Main {
	public static void main(String[] args) {
		// by creating implementation class
		Abc obj = new AbcImpl();
		obj.show();

		// by creating anonymous class
		Abc obj2 = new Abc() {
			public void show() {
				System.out.println("In Anonymous class show");
			}
		};
		obj2.show();

		// by using lambda expression (ADDED IN JAVA 8)
		Abc obj3 = () -> {
			System.out.println("In Lambda class show");
		};
		obj3.show();

		// by using lambda expression (even shorter)
		Abc obj4 = () -> System.out.println("In lambda class(short one) show");
		obj4.show();
	}
}


interface Abc
{
	void show();		// By default, every method in an interface is public and abstract
}


class AbcImpl implements Abc
{
	public void show() {
		System.out.println("In Show");
	}
}

/*
By default, every method in an interface is 'public' and 'abstract'

Three types of interfaces:
	1) Marker interface -> without any methods
	2) Functional Interface -> contains only Single Abstract Method
			- Enables lambda expression (ADDED IN JAVA 8)
			- Since this interface contains only 1 method, class name and method name can be omitted while creating anonymous class
			- Lambda is nothing but a short version of creating anonymous class
	3) Normal Interface

Class extends Class
Interface extends Interface
	- An interface can extend multiple interfaces
Class implements Interface 
*/