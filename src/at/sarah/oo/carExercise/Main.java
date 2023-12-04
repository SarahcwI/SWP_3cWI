package at.sarah.oo.carExercise;


import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car(7, 800, "A1234");
        car1.setColor("red");
        car1.setAmountHonks(3);

        Car car2 = new Car(8, 40, "B5678");
        car2.setColor("blue");
        car2.setAmountHonks(5);

        Car car3 = new Car(17, 120,"C91011");
        System.out.println(car3.getSerialNumber());

        System.out.println("car fuel amount before: " + car2.getFuelAmount());
        car2.drive();
        System.out.println("car fuel amount after: " + car2.getFuelAmount());
        car2.breaking();

        car1.turboBoost();
        car1.honk(car1.getAmountHonks());


        System.out.println(car1.getRemainingRange());
        System.out.println(car2.getRemainingRange());

    }
}
