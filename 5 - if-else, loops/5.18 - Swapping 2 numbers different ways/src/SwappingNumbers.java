public class SwappingNumbers
{
	public static void main(String[] args)
	{
		int a = 8;
		int b = 4;
		System.out.println("Initially: a="+a+" b="+b);
		
		
		// Easy
		// Method 1: Using extra variable(using temp variable)
		int temp = a;
		a = b;
		b = temp;
		System.out.println("Method 1: a="+a+" b="+b);
		
		
		// Moderate
		// Method 2: Using extra bits(using arithmetic operators)
		a = a + b;		// 12 = 8 + 4
		b = a - b;		//  8 = 12 - 4;
		a = a - b;		// 12 = 12 - 8;
		System.out.println("Method 2: a="+a+" b="+b);
		
		
		// Good
		// Method 3: Nothing extra required(using XOR operator)
		a = 8;  		// 1 0 0 0
		b = 4;			// 0 1 0 0
		a = a ^ b;		// a = 1 1 0 0, b = 0 1 0 0
		b = a ^ b;		// a = 1 1 0 0, b = 1 0 0 0
		a = a ^ b;		// a = 0 1 0 0, b = 1 0 0 0
		System.out.println("Method 3: a="+a+" b="+b);
		// num1 ^ num2 = xor
		// xor ^ num1 = num2
		// xor ^ num2 = num2
		
		
		// Best
		// Method 4: Single line code
		a = 4;
		b = 8;
		a = (a+b)-(b=a);
		System.out.println("Method 4: a="+a+" b="+b);		
	}
}