// Finally block is used when you want to execute a statement everytime.

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
		catch(Exception e) {
			System.out.println("All other exceptions" + e);	
		}
		finally {
			// br.close();								// Normally finally block is used to close resources
			System.out.println("Finally BYE");
		}
		System.out.println(k);
	}
}