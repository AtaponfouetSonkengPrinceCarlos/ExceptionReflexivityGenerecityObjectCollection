package managexception;

public class Eception {
	public static void main(String[] args)
	{
		int i = 1;
		int j = 0;
		try
		{
			int z = i/j;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Division par zero"+ e.getMessage());
			e.printStackTrace();
		}
		System.out.println("coucou");
	}

}
