package ExceptionHandling;

public class C_03_UncheckedException_TryCatchFinally {

	public static void main(String[] args) {
		
		
		
System.out.println("Program started");
		
		
		try {
			
			int x=10 /0;
			
			
		} catch(ArithmeticException e)
		{
			System.out.println("Something went wrong "+e.getMessage());
		}
		
		finally {
			System.out.println("This is finally Block");
		}


	}

}
