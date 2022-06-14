package ErrorHandling;

public class TryCatchDemo 
{

	public static void main(String[] args) 
	{

		try 
		{
			int[] c = { 10, 20, 30, 40 };
			System.out.println(c[5]);
			
			int a=10;
			int b=a/0;
			System.out.println(b);
			
		} 
		catch (ArithmeticException e) 
		{
			e.printStackTrace(); // This is for printing exception details.
			System.out.println("Do not dicide by 0");
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			e.printStackTrace(); // This is for printing exception details.
			System.out.println("Please try value within range");
		} 
		finally 
		{
			System.out.println("I will be executed always");
		}

		System.out.println("Hello");

	}

}
