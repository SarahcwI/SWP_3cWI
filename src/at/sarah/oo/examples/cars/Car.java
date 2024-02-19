package at.sarah.oo.examples.cars;

public class Car {
    private String color;
    private int max_speed;
    private int base_price;
    private int distance;
    private Engine engine;
    private Manufacturer manufacturer;

    public Car(String color, int max_speed, int base_price, int distance, Engine engine, Manufacturer manufacturer) {
        this.color = color;
        this.max_speed = max_speed;
        this.base_price = base_price;
        this.distance = distance;
        this.engine = engine;
        this.manufacturer = manufacturer;
    }

    public void discountedPrice(){
        int discountInEuro = base_price * manufacturer.getDiscount() /100;
        int newPrice = base_price - discountInEuro;
        System.out.println("The Base price is " + base_price + " € and the discounted price is " + newPrice + " €");
    }

    public void fuelConsumtion(){
        if (this.distance > 50000) {
            double newConsumtion = engine.getBase_consumption() * 9.8/100;

            System.out.println("The new Basis fuel Consumtion reacher " + newConsumtion + "per km");
        }

        else {
            System.out.println("Consumtion stays the same");
        }

    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public void setMax_speed(int max_speed) {
        this.max_speed = max_speed;
    }

    public int getBase_price() {
        return base_price;
    }

    public void setBase_price(int base_price) {
        this.base_price = base_price;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


}
