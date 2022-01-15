package day1;

public class Returnmethod {



	public String name(String City, String Country)
	{

		String location = City+" - "+Country;
		System.out.println("my Current location :: "+  location);
		return location ;

	}


	public static void main(String[] args) {

		Returnmethod gh = new Returnmethod();

		String a = gh.name("Chennai", "India");

		System.out.println(a);



	}






}
