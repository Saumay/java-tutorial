public class Test
{
	public static void main(String[] args)
	{
		int i,j,k;
		i = 5;
		j = 4;
		k = i+j;
		System.out.println("Sum of " + i + " and " + j + " = " + k);					// returns void
		System.out.println(System.out.printf("Sum of %d and %d = %d",i,j,k));			// returns printStream object
	}
}