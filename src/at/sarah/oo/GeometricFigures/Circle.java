package at.sarah.oo.GeometricFigures;

public class Circle extends Figures{
    private double r;



    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }


    @Override
    public double getArea() {
        return Math.PI * Math.pow(r,2);
    }


}
