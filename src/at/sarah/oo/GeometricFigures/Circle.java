package at.sarah.oo.GeometricFigures;

public class Circle extends Figures{
    private double r;



    public Circle(String name, double r) {
        super(name);
        this.r = r;
    }


    @Override
    public double getArea() {


        return super.getArea();
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
}
