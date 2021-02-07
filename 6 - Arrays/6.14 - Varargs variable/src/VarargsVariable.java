	public class VarargsVariable {
	public static void main(String[] args) {
		Display obj = new Display();
		obj.show(5,6,7);
		obj.show(5);
		// Arrays.asList();				Implementation of varargs
	}
}
 
class Display {
	public void show(int ... a) {		// Varargs - Variable arguments
		for(int i:a)
			System.out.println(i);
	}
	
	public void show(int a) {			// Function Overloading
		System.out.println(a + " Inside single value show");
	}
}