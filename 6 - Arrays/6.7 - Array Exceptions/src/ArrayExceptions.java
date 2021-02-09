import java.util.Random;

public class ArrayExceptions
{
	public static void main(String[] args)
	{
		Random r = new Random();
		int a[] = new int[5];
		
		// Default value
		System.out.println("Default value of Integer is " + a[0]);
		
		// Accessing element that is not present. Will throw ArrayOutOfBoundsException
		try
		{
			System.out.println(a[6]);
		}
		catch(Exception e)
		{
			System.out.println("Maximum index is " + String.valueOf(a.length-1));
		}
		
	}
}