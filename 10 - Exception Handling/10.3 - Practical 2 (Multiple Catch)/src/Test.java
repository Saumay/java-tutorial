// Multiple statements can be there for single try

class Test
{
	public static void main(String[] args) {
		int i,j,k=0;
		int a[] = new int[4];

		i=8;
		j=2;
		try {
			k = i/j;							// Critical Statement
			
			for(int c=0;c<=4;c++) {				// Critical Statement
				a[c] = c;
			}
		}
		catch(ArithmeticException e) {						// ArithmeticException (Unchecked Exception)
			System.out.println("Cannot divide by 0. " + e);		
		}
		catch(ArrayIndexOutOfBoundsException e) {			// ArithmeticException (Unchecked Exception)
			System.out.println("Maxmium number of values is 4. " + e);		
		}
		catch(Exception e) {								// will check all other exceptions
			System.out.println("Unknown Exception");
		}
		System.out.println(k);
	}
}
