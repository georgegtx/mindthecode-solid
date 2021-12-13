package gr.kariera.codingschool.solid.ls.good;

public class ElectricCar extends Car {

	public ElectricCar(ElectricEngine engine) {
		super(engine);
	}

	public void recharge() {
		System.out.println("electric car recharges");
	}
}
