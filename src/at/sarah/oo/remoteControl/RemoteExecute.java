package at.sarah.oo.remoteControl;

public class RemoteExecute {
    public static void main(String[] args) {
        Battery battery1 = new Battery(Battery.TYPE.AA, 52, Battery.TYPE2.CHARGING);
        Battery battery2 = new Battery(Battery.TYPE.AA, 30, Battery.TYPE2.CHARGING);

        Remote remote1 = new Remote("black", 5);

        remote1.addBattery(battery1);
        remote1.addBattery(battery2);


        System.out.println(remote1.getBatteries().get(0).getEnergyOfBattery());
        System.out.println(remote1.getBatteries().get(1).getEnergyOfBattery());


        remote1.turnOn();
        System.out.println(remote1.getBatteries().get(0).getEnergyOfBattery());
        System.out.println(remote1.getBatteries().get(1).getEnergyOfBattery());


        System.out.println(remote1.getStatus());
        //System.out.println("After it was " + car1.getEngine().getTank().getFuelAmount());

    }

}
