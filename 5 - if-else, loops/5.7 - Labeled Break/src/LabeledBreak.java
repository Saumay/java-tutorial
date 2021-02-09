public class LabeledBreak
{
	public static void main(String[] args)
	{
		// Normally
		System.out.println("1:");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println();

		// Unlabelled break - break the current loop (can't break outer loop)
		System.out.println("2:");
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==3)
					break;
				System.out.print("* ");
			}
			System.out.println("");
		}

		System.out.println();

		// Labelled break - can break whichever loop you want to break(too powerful)
		System.out.println("3:");
		outer:	// label
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==3)
					break outer;
				System.out.print("* ");
			}
			System.out.println("");
		}
		
		
		/*
		Test for labelled break - below code will throw Compile Time Error
		Label needs to be present on top of loop inside which break is being called.
		Can't refer to any other label

		System.out.println("4:");
		inner:
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i==3)
					break outer;
				System.out.print("* ");
			}
			System.out.println("");
		}
		*/
	}
}