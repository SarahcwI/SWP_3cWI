package at.sarah.oo.carExercise;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private TYPE typeOfFuel; //Diesel oder Benzin
    private int horsePower;
    private Tank tank;


    public Engine(int horsePower, TYPE type, Tank tank) {
        this.horsePower = horsePower;
        this.tank = tank;
        this.typeOfFuel = type;
    }

    public void turboBoost() {
        if (this.tank.getFuelAmount() > this.tank.getFuelAmount() / 10) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }


//amount should be between 0 and 100

    public double drive(double amountFuel) {
        double newAmount = this.tank.getFuelAmount() - amountFuel;
        this.tank.setFuelAmount(newAmount);
        System.out.println("the motor is running with" + newAmount);
        return newAmount;
    }


    public double getRemainingRange(double amountFuelUsedToDrive) {
        amountFuelUsedToDrive = this.drive(amountFuelUsedToDrive);
        double remainingRange = (100.0 / amountFuelUsedToDrive) * this.tank.getFuelAmount();
        //System.out.println(remainingRange);
        return remainingRange;
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

}

