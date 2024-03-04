package at.sarah.oo.GeometricFigures;

public class main {
    public static void main(String[] args) {

        Circle c1 = new Circle("Circle", 4);

        Rectangle r1 = new Rectangle("Rectangle", 3, 5);

        Square sq1 = new Square("Square", 5);

        System.out.println(sq1.getArea());
        System.out.println(c1.getName());
        System.out.println(c1.getArea());
        System.out.println(r1.getArea());


    }
}
