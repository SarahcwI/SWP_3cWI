package at.sarah.oo.examples.cars;

public class Car_Execute {
    public static void main(String[] args) {

        Engine engine1 = new Engine(Engine.TYPE.DIESEL, 34, 4);


        Manufacturer manufacturer1 = new Manufacturer("BMW", "Germany", 4);


        Car car1 = new Car("red", 45, 45000, 500000, engine1, manufacturer1);

        System.out.println(car1.getEngine().getTypeOfFuel());

        car1.discountedPrice();

        car1.fuelConsumtion();

    }
}
