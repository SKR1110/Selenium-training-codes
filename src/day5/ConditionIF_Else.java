package day5;

public class ConditionIF_Else 
{
	
	public void Student(int i) 
	{
		
		if (i==100)
		{
			System.out.println("Pass");
			
		}
		else
		{
			System.out.println("Fail");
		}
			
		
	}
	
	
	public static void main(String[] args) {
		
		ConditionIF_Else obj = new ConditionIF_Else();
		obj.Student(90);
		
	}
	
	

}
