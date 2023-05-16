package ExceptionHandling;

public class C_03_UncheckedException_TryCatch {

	public static void main(String[] args) {
		
		
		System.out.println("Program started");
		
		
		try {
			
			int x=10 /0;
			
			
		} catch(ArithmeticException e)
		{
			System.out.println("Something went wrong "+e.getMessage());
		}

	}

}
