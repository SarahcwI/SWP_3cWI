package at.sarah.oo.carExercise;

public class Tank {
    private double fuelConsumption;
    private double fuelAmount;


    public Tank(double fuelAmount, double fuelConsumption) {
        this.fuelAmount = fuelAmount;
        this.fuelConsumption = fuelConsumption;
    }


    public double setFuelAmount(double fuelAmount) {
        this.fuelAmount = fuelAmount;
        return fuelAmount;
    }


    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }


    public double getFuelAmount() {
        return fuelAmount;
    }
}
