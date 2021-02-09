public class ShortHandOperators
{
	public static void main(String[] args)
	{
		int i=5;
		i += 2;
		System.out.println(i);
		
		byte b = 8, b2 = 0;
		// b = b * 2.5;			//Error(Lossy conversion) because result is double value
		b2 = (byte)(b * 2.5); 	//No Error. Manual Typecast
		b *= 2.5;				//No Error. Automatic typecast
		System.out.println(b2);
		System.out.println(b);
	}
}