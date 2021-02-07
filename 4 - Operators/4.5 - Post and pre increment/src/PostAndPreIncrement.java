class PostAndPreIncrement
{
	public static void main(String[] args)
	{
		// ++i = Pre increment
		// i++ = Post increment
		int i = 5;
		int j = i++;
		/* equivalent to
			int temp = i;
			i++;
			j = temp;
		*/
		System.out.println("i="+i+", j="+j);
		
		int i2 = 5;
		int j2 = ++i2;
		/* equivalent to
			i2++;
			j2 = i2;
		*/
		System.out.println("i2="+i2+", j2="+j2);
		
		int i3 = 5;
		i3 = i3++;
		/* equivalent to
			int temp = i3;
			i3++;
			i3 = temp;
		*/
		System.out.println(i3); // Value will remain same
	
	}
}
		