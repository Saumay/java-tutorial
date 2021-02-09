public class TernaryOperator
{
	public static void main(String[] args)
	{
		int i = 1;
		int j = 5;
		
		j = i==1 ? 6 : 7;		 // condition ? if true : if false
		System.out.println(j);
		
		//--------
		
		Object obj1;
		Object obj2;
		if(true)
			obj1 = new Integer(10);
		else
			obj1 = new Double(15.0);
		System.out.println(obj1);	// prints 10

		// Ternary replacement for above if else
		obj2 = true ? new Integer(10) : new Double(15.0);
		System.out.println(obj2);	// prints 10.0
		
		// Ternary operator is not exact replacement of if else
		// Ternary operator checks for type of both the values. Whichever type is max, it will occupy that type.
	}
}