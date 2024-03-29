package at.sarah.oo.Lamp;

import at.sarah.oo.examples.cars.Engine;

public class Glowelement {
    private String name;
    private String color;
    private double currentUsage;
    public enum type {on,off}
    private Glowelement.type status; //ein oder aus

    public Glowelement(String name, String color, double currentUsage, type status) {
        this.name = name;
        this.color = color;
        this.currentUsage = currentUsage;
        this.status = status;
    }


    public void turnOn(){
        if (getStatus() == type.off){
            setStatus(type.on);
            setCurrentUsage(this.currentUsage + 5);
            System.out.println("My new currentUsage is " + this.currentUsage);
        }

        else{
            System.out.println("Mein Name ist " + getName() + ". Ich bin bereits eingeschaltet. uwu ");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCurrentUsage() {
        return currentUsage;
    }

    public void setCurrentUsage(double currentUsage) {
        this.currentUsage = currentUsage;
    }

    public type getStatus() {
        return status;
    }

    public void setStatus(type status) {
        this.status = status;
    }
}
