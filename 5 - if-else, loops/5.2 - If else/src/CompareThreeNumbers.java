public class CompareThreeNumbers
{
	public static void main(String[] args)
	{
		int a,b,c;
		a = 14;
		b = 15;
		c = 8;
		
		if(a>b && a>c)	// if first condition is false, second condition won't even be checked
			System.out.println("A");
		else if(b>c)
			System.out.println("B");
		else
			System.out.println("C");
	}
}