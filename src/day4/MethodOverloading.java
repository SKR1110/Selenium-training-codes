package day4;

public class MethodOverloading {
	
	public void add(int i, int j) 
	{
		int k = i+j;
		System.out.println("The Value of K =" + k);
		
	
	}
	
	public void add(String i, String j) 
	{
		String k = i+j;
		System.out.println("My Name = " + k);
		
		
	}
	
	public void add(String i, int j, String L ) 
	{
		String k = i + j + L;
		System.out.println("My Name = " + k);
		
		
	}
	
	
	public static void main(String[] args) 
	{
		MethodOverloading obj = new MethodOverloading();
		obj.add(5, 5);
		obj.add("Sathis kumar", ".R");
		
		
		
	}
	
	
	
	

}
