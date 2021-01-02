public class UserDefinedExceptions
{
	public static void main(String[] args) {
		int i = 25;
		
		try {
			if(i<10)
				throw new ArithmeticException("Value should be more than 10");
			
			// Won't be caught
			// if(i<20)
			// 		throw new Exception("Value should be less than 20");
		
			if(i>20)
				throw new MyException("Value should be less than 20");
		}
		catch(ArithmeticException ex) {
			System.out.println(ex);
		}
		catch(MyException ex) {
			System.out.println(ex);
		}
	}
}

class MyException extends Exception {
	public MyException(String msg) {
		super(msg);
	}
}