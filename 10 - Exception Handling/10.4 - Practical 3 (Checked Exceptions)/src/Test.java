// Checked exceptions have to be handled for the code to compile.
// Unchecked exceptions need not be handled, but it's good to handle them.

import java.io.*;

class Test
{
	public static void main(String[] args) {
		int i,j=1,k=0;
		int a[] = new int[4];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		i=8;
		j=2;
		try {
			System.out.println("Enter a number: ");
			j = Integer.parseInt(br.readLine());			// Checked Exception: Java knows about it and has to be handled.
			
			System.out.println("Output is: ");
			k = i/j;										// Unchecked exception: Need not be handled.
		}
		catch(IOException e) {						
			System.out.println("Unable to parse" + e);
		}
		catch(Exception e) {
			System.out.println("Unknown exception");
		}
		System.out.println(k);
	}
}
