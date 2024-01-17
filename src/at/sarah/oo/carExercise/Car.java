package at.sarah.oo.carExercise;
import java.util.ArrayList;
import java.util.List;

public class Car {
    private Engine engine;
    private String color;
    private String serialNumber;
    private int amountHonks;
    private List<RearMirror> mirrors;


    public Car(String serialNumber, String color, Engine engine, int amountHonks ) { //andere Vars wie oben
        this.serialNumber = serialNumber;
        this.color = color;
        this.engine = engine;
        this.amountHonks = amountHonks;
        this.mirrors = new ArrayList<>();
    }


    public void addMirror (RearMirror rearMirror){
        this.mirrors.add(rearMirror);
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public void drive(double amount, double speed) {
        this.engine.drive(amount);

        if (speed == 100) {
            System.out.println("I am driving with full speed. Speed " + speed);
        }
        if (speed <= 1) {
            System.out.println("I am driving very slowly. Speed: " + speed);
        } else {
            System.out.println("I am simply driving with a speed of  " + speed);
        }
    }


    public void honk() {
        for (int counter = 0; counter < getAmountHonks(); counter++) {
            System.out.println("Tuuuuut meine horsepower ist " + this.getEngine().getHorsePower());
        }
    }

/*Füge eine Methode getRemainingRange() ein. Diese Methode liefert die Rest-Reichweite des Autos zurück.
Diese wird berechnet über den Tankstand und den Verbrauch.*/


    // Setter
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public void setAmountHonks(int amountHonks) {
        this.amountHonks = amountHonks;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // Getter
    public Engine getEngine() {
        return engine;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public int getAmountHonks() {
        return amountHonks;
    }

    public String getColor() {
        return color;
    }
}





