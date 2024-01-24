package at.sarah.oo.remoteControl;


public class Battery {
    public enum TYPE {AAA, AA, C, D}

    private Battery.TYPE sizeOfBattery; //Diesel oder Benzin
    private int energyOfBattery;

    public enum TYPE2 {FULL, CHARGING, DEAD}

    private Battery.TYPE2 statusOFBattery;


    public Battery(TYPE sizeOfBattery, int energyLeft, TYPE2 statusOFBattery) {
        this.sizeOfBattery = sizeOfBattery;
        this.energyOfBattery = energyOfBattery;
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

    public int getEnergyOfBattery() {
        return energyOfBattery;
    }

    public void setEnergyOfBattery(int energyOfBattery) {
        this.energyOfBattery = energyOfBattery;
    }
}
