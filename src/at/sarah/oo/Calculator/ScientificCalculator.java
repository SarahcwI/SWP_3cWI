package at.sarah.oo.Calculator;

public class ScientificCalculator extends BaseCalculator{
    public double sin(double a){
        double rad = Math.toRadians(a);
        return Math.sin(rad);
    }

    public double cos(double b){
        double rad = Math.toRadians(b);
        return Math.cos(rad);
    }
}
