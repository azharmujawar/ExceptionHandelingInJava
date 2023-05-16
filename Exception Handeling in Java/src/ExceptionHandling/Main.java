package ExceptionHandling;

public class Main {

	public static void main(String[] args) {
		
		
		try {
			int numbers[]= {2,5,6,7};
			System.out.println(numbers[10]);
		} 
		
		catch(Exception e)
		{
			System.out.println("Something went Wrong.");
		}
		
		finally {
			System.out.println("This is finally block");
		}

	}

}
