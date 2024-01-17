package at.sarah.oo.carExercise;

public class Car_execute {
    public static void main(String[] args) {
        Tank t1 = new Tank(800, 7);
        Tank t2 = new Tank(40, 8);
        Tank t3 = new Tank(120, 17);

        Engine e1 = new Engine(140, Engine.TYPE.DIESEL, t1);
        Engine e2 = new Engine(220, Engine.TYPE.DIESEL, t2);
        Engine e3 = new Engine(300, Engine.TYPE.DIESEL, t3);

        RearMirror r1 = new RearMirror(100,1);
        RearMirror r2 = new RearMirror(90, 2);

        Wheels w1 = new Wheels(Wheels.TYPE.Winter, 100, 50);
        Wheels w2 = new Wheels(Wheels.TYPE.Summer, 200, 50);
        Wheels w3 = new Wheels(Wheels.TYPE.Winter, 100, 100);
        Wheels w4 = new Wheels(Wheels.TYPE.Winter, 200, 100);


        //Car 1
        Car car1 = new Car("A1234", "red", e1, 0);
        Car car2 = new Car("B5678", "blue", e2, 0);
        Car car3 = new Car("C91011", "white", e3, 0);


        car1.addMirror(r1);
        car1.addMirror(r2);
        car1.addWheel(w1);
        car1.addWheel(w2);
        car1.addWheel(w3);
        car1.addWheel(w4);
        car1.getEngine().turboBoost();
        car1.honk();
        System.out.println(car1.getMirrors().get(0).getPosition());
        System.out.println("Before it was" + car1.getEngine().getTank().getFuelAmount());
        car1.drive(100, 15);
        //System.out.println("After it was " + car1.getEngine().getTank().getFuelAmount());
        System.out.println(car1.getWheels().get(2).getSize());
        System.out.println(car1.getWheels().get(1).getSize());
    }
}
