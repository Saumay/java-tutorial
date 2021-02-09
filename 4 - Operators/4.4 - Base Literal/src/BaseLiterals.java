public class BaseLiterals
{
	// no prefix   --> decimal literal
	// '0b' prefix --> binary literal
	// '0' prefix  --> octal literal
	// '0x' prefix --> hexadecimal literal
	public static void main(String[] args)
	{
		// Decimal
		int i = 101;
		System.out.println(i);

		// Binary
		i = 0B101;				// Stores integer value in binary
		System.out.println(i);
		
		i = 0B1000000000;
		System.out.println(i);
		
		i = 0B1000_000_000;		//underscore can be used in between for keeping count of digits
		System.out.println(i);

		i = 0b1000_000_000; 	//also works with small b
		System.out.println(i);

		// Octal
		i = 0123456;
		System.out.println(i);

		i = 000123456;
		System.out.println(i);

		// Hex
		i = 0x1abc;
		System.out.println(i);	

		i = 0X1abc;				// works with capital X as well
		System.out.println(i);
	}
}