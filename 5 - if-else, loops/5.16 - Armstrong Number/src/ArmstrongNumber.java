public class ArmstrongNumber
{
	public static void main(String[] args)
	{
		/*
		153 -> 	1 5 3
				1*1*1 + 5*5*5 + 3*3*3
				1 + 125 + 27
				153
				(Armstrong Number)
		*/
		
		int n = 153;
		int temp = n;
		int sum = 0;
		
		while(temp>0)
		{
			int digit = temp%10;
			temp = temp/10;
			sum += digit*digit*digit;
			System.out.println(digit);
		}
		if(sum==n)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not an Armstrong Number");
	}
}