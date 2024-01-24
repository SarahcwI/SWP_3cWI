package at.sarah.oo.remoteControl;
import java.util.ArrayList;
import java.util.List;
import at.sarah.oo.remoteControl.Battery;

public class Remote {
    private String colorOfRemote;
    private int amountButtons;
    private List<Battery> battery;


    public Remote(String colorOfRemote, int amountButtons) {
        this.colorOfRemote = colorOfRemote;
        this.amountButtons = amountButtons;
        this.battery = new ArrayList<>();
    }





    public void addBattery(Battery battery) {
        this.battery.add(battery);
    }

    public List<Battery> getBattery() {
        return battery;
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
