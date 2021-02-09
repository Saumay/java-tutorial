public class ObjectPassing
{
	// Call by value
	// Call by reference
	
	/* In Java, EVERYTHING is call by value.
		- in case of primitive types: direct value is passed
		- in case of object: hashcode of object is passed, so two references for same objects are created. And thus changes are reflected when anything is modified for any object.
	*/
	public static void main(String ... args) {
		Paper p = new Paper();
		p.setText("Hello World");
		System.out.println(p.getText());

		Printer pr = new Printer();
		pr.print(p);
		System.out.println(p.getText());	
	}
}

class Printer {
	public void print(Paper p) {
		p.setText("Get lost");
	}
}

class Paper {
	String text;
	
	public void setText(String s) {
		text = s;
	}
	
	public String getText() {
		return text;
	}
}