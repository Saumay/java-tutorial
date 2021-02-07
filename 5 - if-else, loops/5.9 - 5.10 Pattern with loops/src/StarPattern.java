public class StarPattern
{
	public static void main(String[] args)
	{
		/* 
		Patttern 1 -
		*
		* *
		* * *
		* * * *
		*/
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
		
		System.out.println();
		/*
		Pattern 2 -
		* * * *
		*     *
		*     *
		* * * *
		*/
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==1 || j==1 || i==4 || j==4)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
		
		System.out.println();
		/*
		Pattern 3(H/W) -
		1 2 3 4
		2 3 4 1
		3 4 1 2
		4 1 2 3
		*/
		for(int i=1;i<=4;i++)
		{
			for(int j=i;j<=4;j++)
				System.out.print(j+" ");
			for(int k=1;k<i;k++)
				System.out.print(k+" ");
			System.out.println();
		}
		// or
		System.out.println();		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if((i+j-1)%4!=0)
					System.out.print((i+j-1)%4+" ");
				else
					System.out.print(4+" ");
			}
			System.out.println();
		}
	}
}