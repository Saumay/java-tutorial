// Checked exceptions have to be handled.
// Unchecked exceptions need not be handled.

import java.io.*;

class Main 
{
	public static void main(String[] args) {
		int i,j=1,k=0;
		int a[] = new int[4];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		i=8;
		j=2;
		try {
			System.out.println("Enter a number: ");
			j = Integer.parseInt(br.readLine());	// Critical Statement but it's unchecked exception. Need not be handled.
			
			System.out.println("Output is: ");
			k = i/j;								// Checked Exception. Java knows about it and has to be handled.
		}
		catch(IOException e) {						
			System.out.println("Unable to parse" + e);
		}
		System.out.println(k);
	}
}