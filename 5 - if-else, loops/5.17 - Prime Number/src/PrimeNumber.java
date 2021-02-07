public class PrimeNumber
{
	public static void main(String[] args)
	{
		int num = 49;
		if(isPrime(num))
			System.out.println("Is prime");
		else
			System.out.println("Is not prime");
	}
	
	static boolean isPrime(int n)
	{
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		return true;
	}
}


// Beginner: Iterate till n
// Moderate: Iterate till n/2
// Best: Iterate till sqrt(n)