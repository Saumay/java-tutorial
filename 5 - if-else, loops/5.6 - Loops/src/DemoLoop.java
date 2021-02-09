public class DemoLoop
{
	public static void main(String[] args)
	{
		// WHILE Loop : First checks the condition, then runs the statement
		int i = 1;
		while(i<10)
		{
			System.out.println(i); 		// print values from 1 to 9
			i++;
		}
		
		System.out.println();
		
		// DO WHILE loop : First executes statement, then checks condition
		// This loop runs at least once
		i = 15;
		do
		{
			System.out.println(i);
			i++;
		}
		while(i<10);
	
		System.out.println();

		// FOR loop : all three statements essential for loop in same line
		for(i=1;i<10;i++)
			System.out.println(i);		// print values from 1 to 9
	}
}