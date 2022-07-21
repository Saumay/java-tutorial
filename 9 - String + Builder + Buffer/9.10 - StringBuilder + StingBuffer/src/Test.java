// StringBuffer is safe to use by multiple threads. (Thread safe)
// StringBuilder is not safe to use by multiple threads. Methods almost same.

// So, StringBuffer is the better choice

class Test {
	public static void main(String[] args) {
		StringBuffer sbf = new StringBuffer("Navin");
		
		sbf.append(" Reddy");
		System.out.println(sbf);
		
		sbf.replace(0, 5, "Manoj");
		System.out.println(sbf);
		
		sbf.delete(8, 10);
		System.out.println(sbf);
	}
}
