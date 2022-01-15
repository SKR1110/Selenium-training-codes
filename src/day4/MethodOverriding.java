package day4;

public class MethodOverriding extends MethodOverloading {
	
	public void add(int i, int j) 
	{
		int k = i-j;
		System.out.println("The Value of K = " + k);
		
		
	}
	
	public void add(String i, String j) 
	{
		String k = i+j;
		System.out.println("My Name = " + k);
		
		
	}
	
	
	public static void main(String[] args)
	
	{
		
		
		MethodOverriding obj = new MethodOverriding();
		obj.add(8, 6);
		obj.add("SKR", 11, "Oct");
		
				
		
		
	}
	

}
