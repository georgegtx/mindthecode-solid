package gr.kariera.codingschool.solid.ls.good;

public abstract class Engine {

    public int getTotalMileage() {
        return totalMileage;
    }

    public void setTotalMileage(int totalMileage) {
        this.totalMileage = totalMileage;
    }

    private int totalMileage;

    public abstract void doService();
}
