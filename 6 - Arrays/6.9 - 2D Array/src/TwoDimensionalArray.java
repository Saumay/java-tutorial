public class TwoDimensionalArray{
	public static void main(String[] args)
	{
		/*
		int x[] = {5,6,7,8};
		int y[] = {6,7,8,9};
		int z[] = {9,8,7,6};
		Instead of defining 3 different arrays, we can define a 2-D array
		*/
		
		// static initialization
		int p2[][] = {
			{5,6,7,8},
			{6,7,8,9},
			{9,8,7,6}				
		};
		for(int i=0;i<p2.length;i++)
		{
			for(int j=0;j<p2[0].length;j++)
				System.out.print(p2[i][j]+" ");
			System.out.println();
		}
		
		System.out.println();

		// manual initialization
		int p[][] = new int[3][4];
		p[0][0] = 5;
		p[0][1] = 6;
		p[0][2] = 7;
		p[0][3] = 8;
		for(int i=0;i<p.length;i++)
		{
			for(int j=0;j<p[0].length;j++)
				System.out.print(p[i][j]+" ");
			System.out.println();
		}
		
		System.out.println();

		//Using for-each loop
		for(int[] row:p)
		{
			for(int i:row)
				System.out.print(i+" ");
			System.out.println();
		}

	}
}