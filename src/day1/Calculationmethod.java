package day1;

public class Calculationmethod {
	int i = 10;
	int j = 20;

	static int p = 10;
	static int q = 2;

	public void add () {

		int k = i+j;
		System.out.println("addition of :" + k);


	}
	public void sub() {
		int k = i-j;
		System.out.println("sub of :" + k);


	}

	public static void divide () 
	{  
		int k = p/q;
		System.out.println("divide of:" + k) ;


	}
	public static void main(String[] args) {

		Calculationmethod obj = new Calculationmethod();
		obj.add();
		obj.sub();
		divide();






	}

}
