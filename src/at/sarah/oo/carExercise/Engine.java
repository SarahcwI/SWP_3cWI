package at.sarah.oo.carExercise;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private TYPE typeOfFuel; //Diesel oder Benzin
    private double fuelConsumption;
    private double fuelAmount;
    private int horsePower;

    private Tank tank;

    public Engine(int horsePower, TYPE type ,Tank tank) {
        this.horsePower = horsePower;
        this.tank = tank;
        this.typeOfFuel = type;
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

//amount should be between 0 and 100

    public void drive(int amountFuel) {
        double newAmount = this.tank.getFuelAmount() - amountFuel;
        this.tank.setFuelAmount(newAmount);
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

