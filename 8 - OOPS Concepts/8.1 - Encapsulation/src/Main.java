public class Main {
	public static void main(String[] args) {
		A obj = new A();

		// obj.i = 5;		will throw error because i is private
		obj.setVar(5);
		System.out.println(obj.getVar());
	}
}


class A {
	private int i;			// Default value of i will be 0
	
	public int getVar() {
		return this.i;
	}
	
	public void setVar(int j) {
		i = j;
	}
}

/*
Encapsulation principles:
1) To change value of a variable, always use method (getters and setters)
2) Make variables private
*/