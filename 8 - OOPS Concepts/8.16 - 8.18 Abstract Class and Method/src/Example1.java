public class Example1 {
	public static void main(String[] args) {
		MaheshPhone phone = new SureshPhone();
		
		phone.call();
		phone.move();
		phone.dance();
	}
}


abstract class MaheshPhone {							// Abstract class
	public void call() {
		System.out.println("Calling..");
	}
	
	abstract public void move();
	abstract public void dance();
}


abstract class RameshPhone extends MaheshPhone {		// Abstract class
	public void move() {
		System.out.println("Moving..");
	}
	
	abstract public void dance();
}


class SureshPhone extends RameshPhone {					// Concrete class
	public void dance() {
		System.out.println("Dancing..");
	}
}