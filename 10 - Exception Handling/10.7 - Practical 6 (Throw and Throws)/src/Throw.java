/* 
throw:
	- for throwing any exception you want based on a condition
*/

import java.io.*;

class Throw
{
	public static void main(String[] args) throws IOException {
		int i,j=1,k=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		j = Integer.parseInt(br.readLine());
		
		try {
			i = j + k;
			if(i<10)
				throw new ArithmeticException();
		}
		catch(ArithmeticException ex) {
			System.out.println("Caught: sum should be more than 10");
		}
	}
}