public class PrintFibonacciSeries
{
	public static void main(String[] args)
	{
		// 1 1 2 3 5 8 13 ...
		// ith element is sum of last 2 elements
		
		int k = 0, a = 1, b = 1;
		System.out.println(a + " ");
		System.out.println(b + " ");

		while (k < 100) {
			k = a + b;
			System.out.println(k + " ");
			a = b;
			b = k;
		}
	}
}