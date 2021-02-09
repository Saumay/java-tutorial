public class AsciiDemo
{
	public static void main(String[] args)
	{
		// ASCII - Americal Standard Code for Information Interchange
		// 7 bits
		// 0 - 127
		
		for(int i=0;i<=127;i++)
			System.out.printf("%d : %c\n",i,i);		// Using printf

		System.out.println();

		for(int i=0;i<=127;i++)
			System.out.println(i + " : " + (char) i);
	}
}