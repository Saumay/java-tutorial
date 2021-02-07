public class PatternExamplesPart1
{
	public static void main(String[] args)
	{
		/*
		Pattern 1:
		1
		0 1
		1 0 1
		0 1 0 1
		1 0 1 0 1
		*/
		for(int i=1;i<=5;i++)			// rows
		{
			for(int j=1;j<=i;j++)		// columns
			{
				if((i+j)%2==0)
					System.out.print("1 ");
				else
					System.out.print("0 ");
			}
			System.out.println();
		}
	}
}