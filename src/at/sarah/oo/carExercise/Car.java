package at.sarah.oo.carExercise;

public class Car {
    private Engine engine;
    private String color;
    private String serialNumber;
    private int amountHonks;


    public Car(String serialNumber, String color, Engine engine) { //andere Vars wie oben
        this.serialNumber = serialNumber;
        this.color = color;
        this.engine = engine;
    }

    public void drive() {

        System.out.println("I am driving");
    }


    public void honk(int amountOfRepetitions) {
        for (int counter = 0; counter < amountOfRepetitions; counter++) {
            System.out.println("Tuuuuut meine horsepower ist " + this.getEngine().getHorsePower());
        }
    }

/*Füge eine Methode getRemainingRange() ein. Diese Methode liefert die Rest-Reichweite des Autos zurück.
Diese wird berechnet über den Tankstand und den Verbrauch.*/


    // Setter
    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setAmountHonks(int amountHonks) {
        this.amountHonks = amountHonks;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }


    // Getter
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





