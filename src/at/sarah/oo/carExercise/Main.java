package at.sarah.oo.carExercise;


import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        Engine e2 = new Engine(220, Engine.TYPE.DIESEL);
        Engine e3 = new Engine(300, Engine.TYPE.DIESEL);

        Car car1 = new Car(7, 800, "A1234", "red", e1 );
        car1.setAmountHonks(3);

        Car car2 = new Car(8, 40, "B5678", "blue", e2);
        car2.setAmountHonks(5);

        Car car3 = new Car(17, 120,"C91011", "white", e2);
        car2.setAmountHonks(5);

        car2.drive();
        car2.breaking();

        car1.turboBoost();
        car1.honk(car1.getAmountHonks());


        System.out.println(car1.getRemainingRange());
        System.out.println(car2.getRemainingRange());

    }
}
