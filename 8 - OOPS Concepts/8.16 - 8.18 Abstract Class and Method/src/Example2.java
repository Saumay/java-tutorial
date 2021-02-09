public class Example2 {
	public static void main(String[] args) {
		IPhone iphone = new IPhone();			// can use reference of Phone also here
		show(iphone);
		Phone iphone2 = new IPhone();
		show(iphone2);
		
		SamsungS4 samsung = new SamsungS4();	// can use reference of Phone also here
		show(samsung);
		Phone samsung2 = new SamsungS4();
		show(samsung2);
	}
	
	public static void show(Phone phone) {
		phone.showConfig();
	}
}


abstract class Phone {								// abstract class
	abstract public void showConfig();
}


class IPhone extends Phone {							// concrete class
	public void showConfig() {
		System.out.println("IPhone config");
	}
}


class SamsungS4 extends Phone {						// concrete class
	public void showConfig() {
		System.out.println("SamsungS4 config");
	}
}