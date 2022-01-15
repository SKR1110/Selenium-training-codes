package day2;

public class Calcparameters {
	
	
	public int add(int b, int c) {
		
		int a = b+c;
		System.out.println("The addition of A ::" + a);
		return a;
		
		
		
		
	}
	
	public int sub(int b, int c) {
		
		int a = b-c;
		System.out.println("The Substraction of B ::" + a);
		
		return a;
		
	}
	
	public int divide(int b, int c) {
		
		int a = b/c;
		System.out.println("The Division of C ::" + a);
		return a;
		
		
		
	}
	
	public static void main(String[] args) {
		
		Calcparameters obj = new Calcparameters();
		obj.add(3, 3);
		obj.sub(4, 8);
		obj.divide(8, 2);
		
		int d = obj.add(5, 5);
		System.out.println(d);
		
		
		
		
		
		
		
		
	}

}
