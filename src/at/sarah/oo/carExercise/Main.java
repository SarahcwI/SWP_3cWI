package at.sarah.oo.carExercise;


public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "red";
        car1.fuelConsumption = 7;
        car1.serialNumber = "A1234";
        car1.fuelAmount = 110;
        car1.amountHonks = 3;

        Car car2 = new Car();
        car2.color = "blue";
        car2.fuelConsumption = 8;
        car2.serialNumber = "B5678";
        car2.fuelAmount = 40;
        car2.amountHonks = 5;


        System.out.println("car fuel amount before: " + car2.fuelAmount);
        car2.drive();
        System.out.println("car fuel amount after: " + car2.fuelAmount);
        car2.breaking();

        car1.turboBoost();
        car1.honk(car1.amountHonks);

        car1.getRemainingRange();

    }
}
