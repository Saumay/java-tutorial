import java.util.Random;

public class RandomArray
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int a[] = new int[5];
		
		for(int i=0;i<5;i++)
		{
			// will assign random valus from 0 to 100
			a[i] = r.nextInt(100);
		}
		
		// Enhanced for loop (For each loop)
		for(int i : a)
			System.out.println(i);
	}
}