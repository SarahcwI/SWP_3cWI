package at.sarah.oo.GeometricFigures;

public class Square extends Figures{
    private double a;

    public Square(String name, double a) {
        super(name);
        this.a = a;
    }


     if(getName().equalsIgnoreCase("square")){
        calculateArea = Math.pow(square.getA(), 2);
        return calculateArea;
    }


    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }
}
