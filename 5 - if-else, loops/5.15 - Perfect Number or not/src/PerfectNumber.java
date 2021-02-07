public class PerfectNumber
{
	public static void main(String[] args)
	{
		// Perfect Number = A number which is equal to the sum of it''s factors
		// 6 -> 1 + 2 + 3 = 6
		// 28 -> 1 + 2 + 4 + 7 + 14 = 28
		
		int n = 28;
		if(isPerfect(n))
			System.out.println("Perfect Number");
		else
			System.out.println("Not a Perfect Number");
	}
	
	static boolean isPerfect(int n)
	{
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
			{
				sum = sum + i;
			}
		}
		return sum==n ? true : false;
	}
}