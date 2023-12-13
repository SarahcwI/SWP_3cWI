package at.sarah.oo.carExercise;

public class Tank {
    private double fuelConsumption;
    private double fuelAmount;


    public Tank(double fuelAmount, double fuelConsumption) {
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
    }

    public void turboBoost() {
        if (this.fuelAmount > this.fuelAmount / 10) {
            System.out.println("SuperBoostMode");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public double getFuelConsumption() {
        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println(fuelConsumption);
        return fuelConsumption;

    }

    public void consumeFuel(){
        this.fuelAmount -= 10;
    }

    public double getRemainingRange() {
        double remainingRange = 100.0 / this.fuelConsumption * this.fuelAmount;
        //System.out.println(remainingRange);
        return remainingRange;
    }

    public void setFuelAmount(double fuelAmount) {
        if (fuelAmount > 200) {
            this.fuelAmount = 100;
        } else {
            this.fuelAmount = fuelAmount;
        }
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }
}
