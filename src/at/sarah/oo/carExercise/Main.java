package at.sarah.oo.carExercise;

import java.awt.*;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL);
        Engine e2 = new Engine(220, Engine.TYPE.DIESEL);
        Engine e3 = new Engine(300, Engine.TYPE.DIESEL);


        Tank t1 = new Tank(800,7);
        Tank t2 = new Tank(40, 8);
        Tank t3 = new Tank(120, 17);


        Car car1 = new Car("A1234", "red", e1);
        car1.setAmountHonks(3);

        Car car2 = new Car( "B5678", "blue", e2);
        car2.setAmountHonks(5);

        Car car3 = new Car( "C91011", "white", e2);
        car2.setAmountHonks(5);

        car1.honk(car1.getAmountHonks());




        car1.drive();

    }
}
