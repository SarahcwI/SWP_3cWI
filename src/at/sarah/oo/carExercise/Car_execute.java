package at.sarah.oo.carExercise;

public class Car_execute {
    public static void main(String[] args) {
        Tank t1 = new Tank(800, 7);
        Tank t2 = new Tank(40, 8);
        Tank t3 = new Tank(120, 17);

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL, t1);
        Engine e2 = new Engine(220, Engine.TYPE.DIESEL, t2);
        Engine e3 = new Engine(300, Engine.TYPE.DIESEL, t3);


     //Car 1
        Car car1 = new Car("A1234", "red", e1, 3);
                System.out.println("out1:" + car1.getEngine().getTank().getFuelAmount());
        car1.drive(100);
        System.out.println("out2:" + car1.getEngine().getTank().getFuelAmount());


     //Car 2
        Car car2 = new Car("B5678", "blue", e2, 5);
        car2.honk();

     // Car 3
        Car car3 = new Car("C91011", "white", e3, 2);
        car3.honk();


        car1.drive(50);

    }
}
