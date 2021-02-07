public class SwitchCase
{
	public static void main(String[] args)
	{
		int i = 7;
		switch(i)
		{
			case 0:
				System.out.println("Zero");
				break;						// By default, if this condition matches, it will execute all subsequent statements as well. Break is used to prevent this.
			case 7:
				System.out.println("Seven");
				break;
			case 9:
				System.out.println("Nine");
				break;
			default:						// if none of the cases match
				System.out.println("Some Number");
				
			// Switch Case in Java supports String also.
		}
	}
}