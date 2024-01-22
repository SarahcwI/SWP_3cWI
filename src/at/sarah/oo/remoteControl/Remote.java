package at.sarah.oo.remoteControl;

import at.sarah.oo.carExercise.RearMirror;
import at.sarah.oo.remoteControl.Battery;

import java.util.List;

public class Remote {

    private Battery battery;
    private String colorOfRemote;
    private int amountButtons;

    public Remote(Battery battery, String colorOfRemote, int amountButtons) {
        this.battery = battery;
        this.colorOfRemote = colorOfRemote;
        this.amountButtons = amountButtons;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public String getColorOfRemote() {
        return colorOfRemote;
    }

    public void setColorOfRemote(String colorOfRemote) {
        this.colorOfRemote = colorOfRemote;
    }

    public int getAmountButtons() {
        return amountButtons;
    }

    public void setAmountButtons(int amountButtons) {
        this.amountButtons = amountButtons;
    }
}
