package at.sarah.oo.Calculator;

public class main {

    public static void main(String[] args) {
        BaseCalculator bc1 = new BaseCalculator();
        ScientificCalculator sc1 = new ScientificCalculator();
        SquarerootCalculator sqrt1 = new SquarerootCalculator();


        //bc1 add
        System.out.println(bc1.add(4,6));
        //bc1 subtract
        System.out.println(bc1.subtract(4,6));
        //bc1 multiply
        System.out.println(bc1.multiply(4,6));
        // bc1 divide
        System.out.println(bc1.divide(10,4));

        //sc1 sin
        System.out.println(sc1.sin(50));
        //sc1 cos
        System.out.println(sc1.cos(50));
        //sc1 add
        System.out.println(sc1.add(4,5));

        //sqrt1 squareroot
        System.out.println(sqrt1.squareRoot(9));
        //sqrt1 add
        System.out.println(sqrt1.add(5,8));


    }
}
