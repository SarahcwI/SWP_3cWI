package at.sarah.oo.carExercise;

public class Engine {
    public enum TYPE {DIESEL, GAS}

    private double fuelConsumption;
    private double fuelAmount;
    private int horsePower;
    private TYPE typeOfFuel; //Diesel oder Benzin
    private Tank tank;

    public Engine(int horsePower, TYPE typeOfFuel, Tank tank) {
        this.horsePower = horsePower;
        this.typeOfFuel = typeOfFuel;
        this.tank = tank;
    }

    public void turboBoost() {
        if (this.fuelAmount > this.fuelAmount / 10) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public double getRemainingRange() {
        double remainingRange = 100.0 / this.fuelConsumption * this.fuelAmount;
        //System.out.println(remainingRange);
        return remainingRange;
    }

    public void consumeFuel(){
        this.fuelAmount -= 10;
    }



//amount should be between 0 and 100

    public void drive(int amountFuel) {
        System.out.println("the motor is running with" + amountFuel);
    }

    public void breaking() {
        System.out.println("I'm breaking");
    }


    public Tank getTank() {
        return tank;
    }

    public void setTank(Tank tank) {
        this.tank = tank;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYPE getTypeOfFuel() {
        return typeOfFuel;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
    }
}

