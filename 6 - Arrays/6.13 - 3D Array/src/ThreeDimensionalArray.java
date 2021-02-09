public class ThreeDimensionalArray{
	public static void main(String[] args)
	{
		int a[] = new int[4];
		int b[][] = new int[4][4];
		int c[][][] = new int[4][4][4];
				
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				for(int k=0;k<c[0][0].length;k++)
				{
					c[i][j][k] = i+j+k;
				}
			}
		}
		
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[0].length;j++)
			{
				for(int k=0;k<c[0][0].length;k++)
				{
					System.out.print(c[i][j][k]+" ");
				}
				System.out.println();
			}
			System.out.println();
		}

		System.out.println("Using for-each loop:");
		for(int[][] i : c) {
			for(int[] j : i) {
				for(int k : j) {
					System.out.print(k + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}