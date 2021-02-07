// Finally is normally used for closing resources

import java.io.*;

class Old
{
	public static void main(String[] args) {
		// Till Java 1.6 - lengthy code
		
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
	}
}