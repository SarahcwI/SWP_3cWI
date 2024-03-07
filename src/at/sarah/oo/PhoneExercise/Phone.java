package at.sarah.oo.PhoneExercise;

public class Phone {
    private String color;
    private Camera camera;
    private SDCard sdCard;
    private SIMCard simCard;

    public Phone(String color, Camera camera, SDCard sdCard, SIMCard simCard) {
        this.color = color;
        this.camera = camera;
        this.sdCard = sdCard;
        this.simCard = simCard;
    }

    public void takePicture(){
        camera.makePicture();
    }

    public void makeCall(String number){
        System.out.println(simCard.doCall(number));

    }

    public int getFreeSpace(){
        return sdCard.getFreeSpace();
    }

    public String getColor() {
        return color;
    }

    public void printAllFiles(){
        sdCard.getAllFiles();
    }

    public Camera getCamera() {
        return camera;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public SIMCard getSimCard() {
        return simCard;
    }
}
