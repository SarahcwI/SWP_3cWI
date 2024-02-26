package at.sarah.oo.carExercise;

public class Truck extends Car {
    private String trailer;


    public Truck(String serialNumber, String color, Engine engine, int amountHonks, String trailer) {
        super(serialNumber, color, engine, amountHonks);
        this.trailer = trailer;
    }

    @Override
    public void drive(double amount, double speed) {
        System.out.println("Im trucking the drive");
       // super.drive(amount, speed);
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
