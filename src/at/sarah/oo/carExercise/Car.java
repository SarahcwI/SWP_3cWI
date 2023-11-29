package at.sarah.oo.carExercise;

public class Car {
    public String color;
    public double fuelConsumption;
    public String serialNumber;
    public double fuelAmount;
    public int amountHonks;
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

}

