package at.sarah.oo.remoteControl;
import java.util.ArrayList;
import java.util.List;

public class Remote {
    private String colorOfRemote;
    private int amountButtons;
    private List<Battery> batteries;


    public Remote(String colorOfRemote, int amountButtons) {
        this.colorOfRemote = colorOfRemote;
        this.amountButtons = amountButtons;
        this.batteries = new ArrayList<>();
    }

    public void turnOn(){
        int battery1 = this.batteries.get(0).getEnergyOfBattery();
        batteries.get(0).setEnergyOfBattery(battery1 - 5);
        System.out.println("Verbraucher Angeschlossen");

        int battery2 = this.batteries.get(1).getEnergyOfBattery();
        batteries.get(1).setEnergyOfBattery(battery2 - 5);

        System.out.println("Verbraucher Angeschlossen");
    }

    public void turnOff(){

        System.out.println("Kein Verbraucher Angeschlossen");
        System.out.println("Kein Verbraucher Angeschlossen");
    }

    public int getStatus(){
        int battery1 = batteries.get(0).getEnergyOfBattery();
        int battery2 = batteries.get(1).getEnergyOfBattery();

        int status = (battery1+ battery2)/2;
        return status;

    }

    public void addBattery(Battery battery) {
        this.batteries.add(battery);
    }

    public List<Battery> getBatteries() {
        return batteries;
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
