package at.sarah.oo.GeometricFigures;

public class Square extends Figures{

    private double a;

    public Square(String name, double a) {
        super(name);
        this.a = a;
    }


    @Override
    public double getArea() {
        return Math.pow(a, 2);
    }
}
