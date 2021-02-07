class BitwiseOperators
{
	public static void main(String[] args)
	{
		// Bitwise AND - &
		// Bitwise OR  - |
		// Bitwise XOR - ^
		int a = 25; 	// 1 1 0 0 1
		int b = 15; 	// 0 1 1 1 1
		
		int c = a & b;	// 0 1 0 0 1 = 9
		System.out.println(c);
		
		int d = a | b;  // 1 1 1 1 1 = 31
		System.out.println(d);
		
		int e = a ^ b;  // 1 0 1 1 0 = 22
		System.out.println(e);
	}
}