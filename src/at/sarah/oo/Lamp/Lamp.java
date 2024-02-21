package at.sarah.oo.Lamp;

import at.sarah.oo.carExercise.RearMirror;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<Glowelement> glowElements;

    public Lamp() {
        this.glowElements = new ArrayList<>();
    }

    public void addGlowElement(Glowelement glowelement){
        this.glowElements.add(glowelement);
    }

    public void turnAllOn(){
        System.out.println("...Turning all on...");
        for (int counter = 0; counter < glowElements.size(); counter++) {
            this.glowElements.get(counter).turnOn();
        }
    }

    public double getOverallPowerUsage(){
        double overallUsage = 0;
        for (int counter = 0; counter < glowElements.size(); counter++) {
            overallUsage += this.glowElements.get(counter).getCurrentUsage();
        }

        return overallUsage;
    }
    
    public List<Glowelement> getGlowElements() {
        return glowElements;
    }

    public void setGlowElements(List<Glowelement> glowElements) {
        this.glowElements = glowElements;
    }
}
