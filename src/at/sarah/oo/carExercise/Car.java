package at.sarah.oo.carExercise;

public class Car {
    String color;
    double fuelConsumption;
    String serialNumber;

    double fuelAmount;
    int amountHonks;

    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("I am driving");
    }

    public void breaking(){
        System.out.println("I'm breaking");
    }

    public void turboBoost(){
        if (fuelAmount > fuelAmount/10) {
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

   public void getRemainingRange(){

    }

}

