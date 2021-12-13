package gr.kariera.codingschool.solid.ls.bad;

public class Tank {

    private int tankLevel;

    public int getTankLevel() {
        return tankLevel;
    }

    public void setTankLevel(int tankLevel) {
        if (tankLevel >= 0 && tankLevel <= 100)
            this.tankLevel = tankLevel;
        else
            System.out.println("" + tankLevel + " exceeds the range 0-100 !");
    }
}
