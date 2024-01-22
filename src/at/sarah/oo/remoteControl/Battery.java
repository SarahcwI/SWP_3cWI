package at.sarah.oo.remoteControl;


public class Battery {
    public enum TYPE {AAA, AA, C, D}
    private Battery.TYPE sizeOfBattery; //Diesel oder Benzin
    private int energyLeft;
    public enum TYPE2 {FULL, CHARGING, DEAD}
    private Battery.TYPE2 statusOFBattery;


    public Battery(TYPE sizeOfBattery, int energyLeft, TYPE2 statusOFBattery) {
        this.sizeOfBattery = sizeOfBattery;
        this.energyLeft = energyLeft;
        this.statusOFBattery = statusOFBattery;
    }


    public TYPE2 getStatusOFBattery() {
        return statusOFBattery;
    }

    public void setStatusOFBattery(TYPE2 statusOFBattery) {
        this.statusOFBattery = statusOFBattery;
    }

    public TYPE getSizeOfBattery() {
        return sizeOfBattery;
    }

    public void setSizeOfBattery(TYPE sizeOfBattery) {
        this.sizeOfBattery = sizeOfBattery;
    }

    public int getEnergyLeft() {
        return energyLeft;
    }

    public void setEnergyLeft(int energyLeft) {
        this.energyLeft = energyLeft;
    }
}
