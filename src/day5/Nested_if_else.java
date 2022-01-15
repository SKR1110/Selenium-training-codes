package day5;


public class Nested_if_else {
	
	public void studentmarks(int Mark)
	{
		
		if(Mark >=90)
		{
			System.out.println("Distinction");
			
		}
		else if(Mark >=60 && Mark <=89)
			
		{
			System.out.println("First Class");
		}
		
		else if (Mark >=35 && Mark <=59)
		
		{
			System.out.println("Second Class");
			
		}
		
		else 
		
		{
			System.out.println("Fail");
		}
		
		
	}
	
	public static void main(String[] args) {
		
		Nested_if_else obj = new Nested_if_else();
		obj.studentmarks(99);
		obj.studentmarks(72);
		obj.studentmarks(60);
		obj.studentmarks(34);
	}

}
