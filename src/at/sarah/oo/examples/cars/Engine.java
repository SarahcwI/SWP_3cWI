package at.sarah.oo.examples.cars;

import at.sarah.oo.carExercise.Tank;

public class Engine {
    public enum TYPE {DIESEL, GAS}
    private TYPE typeOfFuel; //Diesel oder Benzin
    private int power;
    private double base_consumption;

    public Engine(TYPE typeOfFuel, int power, int base_consumption) {
        this.typeOfFuel = typeOfFuel;
        this.power = power;
        this.base_consumption = base_consumption;
    }


    public TYPE getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(TYPE typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getBase_consumption() {
        return base_consumption;
    }

    public void setBase_consumption(int base_consumption) {
        this.base_consumption = base_consumption;
    }
}
