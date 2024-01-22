package at.sarah.oo.remoteControl;

import at.sarah.oo.carExercise.RearMirror;
import at.sarah.oo.carExercise.Wheels;
import at.sarah.oo.remoteControl.Battery;

import java.util.ArrayList;
import java.util.List;

public class Remote {


    private String colorOfRemote;
    private int amountButtons;

    private List<Battery> battery;


    public Remote(Battery battery, String colorOfRemote, int amountButtons) {
        this.battery = new ArrayList<>();
        this.colorOfRemote = colorOfRemote;
        this.amountButtons = amountButtons;
    }


    public void addBattery (Battery battery){
        this.battery.add(battery);
    }

    public List<Battery> getBattery() {
        return battery;
    }

    public void setBattery(List<Battery> battery) {
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
