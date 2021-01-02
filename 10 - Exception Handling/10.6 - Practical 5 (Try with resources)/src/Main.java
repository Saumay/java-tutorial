// Can only be used in Java 1.7 or later

import java.io.*;

class Main 
{
	public static void main(String[] args) {
		// Till Java 1.6
		
		BufferedReader br = null;
		try {
			String str = "";
			br = new BufferedReader(new InputStreamReader(System.in));
			str = br.readLine();
		}
		catch(IOException e) {
			System.out.println(e);
		}
		finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		// Code for doing same thing From Java 1.7
		// Create resource inside try parenthesis
		// Java will handle the error and will close the resource itself
		// Can be used for sockets, files, databases etc.
		try(BufferedReader br2 = new BufferedReader(new InputStreamReader(System.in))) {
			String str = br2.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}