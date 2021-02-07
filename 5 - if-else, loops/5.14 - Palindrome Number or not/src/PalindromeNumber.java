public class PalindromeNumber
{
	public static void main(String[] args)
	{
		// Palindrome number : 12321
		// Logic: Reverse number and check if it's equal to original number
		
		int n = 1345431;
		int temp = n;
		int reverse = 0;
		while(temp > 0) {
			int digit = temp%10;
			temp = temp/10;
			reverse = (reverse*10) + digit;
		}
		System.out.println(reverse);
		
		if(n==reverse)
			System.out.println("Palindrome number");
		else
			System.out.println("Not a palindrome number");
	}
}