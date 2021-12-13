package gr.kariera.codingschool.solid.ls.bad;

public class HydrogenCar extends Car {

    @Override
    public void refillTankWithPetrol() {
        System.out.println("hydrogen cars dont refill with petrol!");
    }
}
