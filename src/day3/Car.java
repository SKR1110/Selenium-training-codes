package day3;

public class Car extends Vechicle {

	public void carEngineSpeed() {

		System.out.println("Car engine speed is 2000cc::");
	}

	public static void main(String[] args) {


		Car obj = new Car();// object creation 
		obj.carEngineSpeed();// call local method
		obj.getColor(); // call parent method


	}

}
