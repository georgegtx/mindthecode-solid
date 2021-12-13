package gr.kariera.codingschool.solid.ls.bad;

public class Car {

    private Engine engine;
    private Tank tank;

    public Car() {
        engine = new Engine();
        tank = new Tank();
    }

    public void addOilToEngine() {
        engine.addOil();
    }

    public void refillTankWithPetrol() {
        tank.setTankLevel(100);
    }

    public void accelerate() {
        System.out.println("Car accelerates");
    }
}