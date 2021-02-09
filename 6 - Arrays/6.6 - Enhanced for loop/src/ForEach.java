public class ForEach
{
	public static void main(String[] args)
	{
		int a[] = new int[5];
		
		for(int i=0;i<5;i++)
		{
			a[i] = i + 1;
		}
		
		// Enhanced for loop (For each loop)
		for(int i : a)
			System.out.println(i);
	}
}