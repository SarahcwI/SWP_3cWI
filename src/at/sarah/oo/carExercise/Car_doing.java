package at.sarah.oo.carExercise;

public class Car_doing {
    public static void main(String[] args) {

        Tank t1 = new Tank(800, 7);
        Tank t2 = new Tank(40, 8);
        Tank t3 = new Tank(120, 17);

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL, t1);
        Engine e2 = new Engine(220, Engine.TYPE.DIESEL, t2);
        Engine e3 = new Engine(300, Engine.TYPE.DIESEL, t3);


        Car car1 = new Car("A1234", "red", e1);
        car1.setAmountHonks(3);
        System.out.println(car1.getEngine().getTank().getFuelAmount());
        car1.drive();
        System.out.println(car1.getEngine().getTank().getFuelAmount());
        Car car2 = new Car("B5678", "blue", e2);
        car2.setAmountHonks(5);

        Car car3 = new Car("C91011", "white", e3);
        car2.setAmountHonks(5);

        car1.honk(car1.getAmountHonks());
        car1.drive();

        car1.getEngine().getTank().getFuelConsumption();
    }
}
