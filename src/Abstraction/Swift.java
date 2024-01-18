package Abstraction;

public class Swift extends Vehicle{

	@Override
	public void fuelType() {

		System.out.println("Swift car fuel type is petrol");
	}

	@Override
	public void company() {

		System.out.println("Swift car company is Maruti");
	}


	public static void main(String[]args) {

		Swift obj = new Swift();

		obj.start();
		obj.fuelType();
		obj.company();

	}
}
