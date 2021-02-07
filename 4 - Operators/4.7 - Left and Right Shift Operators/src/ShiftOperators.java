class ShiftOperators
{
	public static void main(String[] args)
	{
		// Right Shift : >>
		// Left Shift : <<
		
		int a = 8;		// 1 0 0 0
		int b = a >> 2;	// 0 0 1 0 = 2
		System.out.println(b);
		
		a = 25;			// 1 1 0 0 1
		b = a >> 2;		// 0 0 1 1 0 = 6
		System.out.println(b);
		
		a = 8;			// 1 0 0 0
		b = a << 2;		// 1 0 0 0 0 0 = 32
		System.out.println(b);
		
		a = 25;			// 1 1 0 0 1
		b = a << 2;		// 1 1 0 0 1 0 0 = 100
		System.out.println(b);
	}
}