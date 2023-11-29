package at.sarah.oo.carExercise;


public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(7, 110, "A1234");
        car1.color = "red";
        car1.amountHonks = 3;

        Car car2 = new Car(8, 40, "B5678");
        car2.color = "blue";
        car2.amountHonks = 5;

        Car car3 = new Car(17, 120,"C91011");
        System.out.println(car3.serialNumber);

        System.out.println("car fuel amount before: " + car2.fuelAmount);
        car2.drive();
        System.out.println("car fuel amount after: " + car2.fuelAmount);
        car2.breaking();

        car1.turboBoost();
        car1.honk(car1.amountHonks);


        System.out.println(car1.getRemainingRange());
        System.out.println(car2.getRemainingRange());

    }
}
