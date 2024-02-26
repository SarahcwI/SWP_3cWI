package at.sarah.oo.carExercise;

public class Truck extends Car {
    private String trailer;

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public Truck(String serialNumber, String color, Engine engine, int amountHonks, String trailer) {
        super(serialNumber, color, engine, amountHonks);
        this.trailer = trailer;


    }
}
