package at.sarah.oo.PhoneExercise;

public class Camera {
    private String resolution;
    private SDCard sdCard;

    public Camera(String resolution, SDCard sdCard) {
        this.resolution = resolution;
        this.sdCard = sdCard;
    }

    public void makePicture(){
        PhoneFile file = new PhoneFile("Picture", "jpg", 6);
        sdCard.safeFile(file);

    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public String getResolution() {
        return resolution;
    }
}
