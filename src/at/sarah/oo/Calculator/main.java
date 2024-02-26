package at.sarah.oo.Calculator;

public class main {

    public static void main(String[] args) {
        BaseCalculator bc1 = new BaseCalculator();
        System.out.println(bc1.add(4,6));

        System.out.println(bc1.divide(10,4));
    }
}
