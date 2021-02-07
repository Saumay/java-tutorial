/* 
throws:
  * - suppress the exception
	- doesn't handle the exception
	- can be used when developer is sure that there will never be an exception
	- If throws is not added, compiler will throw compile time error and will ask to add try/catch since it is a checked exception.
*/

import java.io.*;

class Throws 
{
	public static void main(String[] args) throws IOException {
		int i,j=1,k=0;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		j = Integer.parseInt(br.readLine());
		
	}
}