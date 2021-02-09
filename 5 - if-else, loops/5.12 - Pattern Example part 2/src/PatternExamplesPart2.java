public class PatternExamplesPart2
{
	public static void main(String[] args)
	{
		/*
		Pattern 1:
		1
		2 2
		3 3 3
		4 4 4 4
		5 5 5 5 5
		*/
		for(int i=1;i<=5;i++)			// rows
		{
			for(int j=1;j<=i;j++)		// columns
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}