package day5;

public class Condition_for_Loop {
	
	public void loop(int Num) 
	
	{
		
		for(int i=0; i<=Num; i++)
		{
			System.out.println(i);
		}
		
		
	}
	
	public void loopAlphabets() 
	
	{
		char alpha;
		//for(alpha= 'b'; alpha <= 'f'; ++alpha)
		for(alpha = 'a'; alpha <= 'z'; ++alpha)
		{
			//System.out.println(alpha + "fdfhd");
			System.out.println(alpha);
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		Condition_for_Loop obj = new Condition_for_Loop();
		obj.loopAlphabets();
		
	}
	

}
