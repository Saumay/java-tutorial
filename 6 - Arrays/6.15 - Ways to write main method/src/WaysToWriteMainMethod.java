public class WaysToWriteMainMethod {
	
	// We can't pass Integer[] args or Object[] args as parameter to main function.
	
	// public static void main(String[] args) {
	// 		System.out.println("Hello");
	// }
	
	//Another way to write main method
	//Position of public and static can be interchanged
	static public void main(String ... args) {	// using varargs - Variable arguments
		System.out.println("Hello");
	}
}