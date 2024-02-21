package at.sarah.oo.Lamp;

public class main {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();

        Glowelement g1 = new Glowelement("LED_R", "red",34, Glowelement.type.off);
        Glowelement g2 = new Glowelement("LED_B", "blue",24, Glowelement.type.off);

        lamp.addGlowElement(g1);
        lamp.addGlowElement(g2);


        //lamp.getGlowElements().get(0).turnOn();

        lamp.turnAllOn();
        System.out.println(lamp.getOverallPowerUsage());

    }
}
