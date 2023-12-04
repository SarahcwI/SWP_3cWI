package at.sarah.oo.carExercise;

public class Car {
    private String color;
    private double fuelConsumption;
    private String serialNumber;
    private double fuelAmount;
    private int amountHonks;

    public Car(int fuelConsumption, double fuelAmount, String serialNumber){ //andere Vars wie oben
        this.fuelConsumption = fuelConsumption;
        this.fuelAmount = fuelAmount;
        this.serialNumber = serialNumber;
    }

    public void drive(){

        this.fuelAmount = this.fuelAmount - this.fuelConsumption;
        System.out.println("I am driving");
    }

    public void breaking(){
        System.out.println("I'm breaking");
    }

    public void turboBoost(){
        if (this.fuelAmount > this.fuelAmount/10) {
            System.out.println("SuperBoostMode");
        }
        else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void honk (int amountOfRepetitions){
        for (int counter = 0; counter < amountOfRepetitions; counter++) {
            System.out.println("Tuuuuut");
        }
    }

/*Füge eine Methode getRemainingRange() ein. Diese Methode liefert die Rest-Reichweite des Autos zurück.
Diese wird berechnet über den Tankstand und den Verbrauch.*/

   public double getRemainingRange(){
    double remainingRange = 100.0/this.fuelConsumption * this.fuelAmount;
       //System.out.println(remainingRange);
       return remainingRange;
    }

    public void setAmountHonks(int amountHonks) {
        this.amountHonks = amountHonks;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFuelAmount(double fuelAmount) {
        if(fuelAmount>200){
            this.fuelAmount = 100;
        }
        else {
            this.fuelAmount = fuelAmount;
        }
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public double getFuelAmount() {
        return fuelAmount;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getAmountHonks() {
        return amountHonks;
    }

    public String getColor() {
        return color;
    }
}





