package gr.kariera.codingschool.solid.ls.good;

public class Car {

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void accelerate() {
        System.out.println("Car accelerates");
    }
}