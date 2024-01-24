package at.sarah.oo.remoteControl;

public class RemoteExecute {
    public static void main(String[] args) {
        Battery battery1 = new Battery(Battery.TYPE.AA, 52, Battery.TYPE2.CHARGING);
        Battery battery2 = new Battery(Battery.TYPE.AA, 52, Battery.TYPE2.CHARGING);

        Remote remote1 = new Remote("black", 5);

        remote1.addBattery(battery1);


    }

}
