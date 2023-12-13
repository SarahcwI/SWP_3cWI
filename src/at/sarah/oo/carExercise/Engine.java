package at.sarah.oo.carExercise;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private int horsePower;
    private TYPE typeOfFuel; //Diesel oder Benzin
    private Tank tank;

    public Engine(int horsePower, TYPE typeOfFuel, Tank tank) {
        this.horsePower = horsePower;
        this.typeOfFuel = typeOfFuel;
        this.tank = tank;
    }

//amount should be between 0 and 100

    public void drive(int amountFuel) {
        System.out.println("the motor is running with" + amountFuel);
    }

    public void breaking() {
        System.out.println("I'm breaking");
    }


    public Tank getTank() {return tank; }

    public void setTank(Tank tank) {this.tank = tank; }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getTypeOfFuel() {
        return typeOfFuel;
    }
}
