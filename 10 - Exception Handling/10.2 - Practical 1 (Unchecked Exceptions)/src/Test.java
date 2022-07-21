class Test
{
	public static void main(String[] args) {
		int i,j,k=0;
		
		i=8;
		j=0;
		try {
			k = i/j;					// Critical Statement
		}
		catch(ArithmeticException e) {			// ArithmeticException (Unchecked Exception)
			System.out.println("Cannot divide by 0. " + e);		
		}
		System.out.println(k);
	}
}
