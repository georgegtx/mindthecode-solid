package gr.kariera.codingschool.solid.ls.bad;

public class ElectricCar extends Car {

	@Override
	public void addOilToEngine() {
		System.out.println("the engine of an electric car does not need oiling!");
	}

	@Override
	public void refillTankWithPetrol() {
		System.out.println("an electric car does not need petrol");
	}

	public void recharge() {
		System.out.println("electric car recharges");
	}
}
