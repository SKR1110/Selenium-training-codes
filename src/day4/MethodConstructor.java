package day4;

public class MethodConstructor 
{

	public MethodConstructor(int i, int j, int k)

	{
		int M = i+j+k;
		System.out.println("The Value of M = " + M);


	}

	public MethodConstructor(int i, int j)

	{
		int M = i+j;
		System.out.println("The Value of M = " + M);


	}

	public MethodConstructor(String i, int j, String k)

	{
		String M = i+j+k;
		System.out.println("The Value of M = " + M);


	}

	public void sub(int i, int j)

	{
		int M = i-j;
		System.out.println("The Value of M = " + M);

	}


	public static void main(String[] args) 

	{
		MethodConstructor obj = new MethodConstructor("SKR", 11, "OCt");
		obj.sub(8, 5);



	}


}
