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

    public List<Glowelement> getGlowElements() {
        return glowElements;
    }

    public void setGlowElements(List<Glowelement> glowElements) {
        this.glowElements = glowElements;
    }
}
