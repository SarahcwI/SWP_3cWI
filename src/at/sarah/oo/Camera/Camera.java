package at.sarah.oo.Camera;

import java.util.ArrayList;

public class Camera {
    private int pixel;
    private int weightInKg;
    private String colour;
    public enum TYPE {small, medium , large}
    private Camera.TYPE resolutionOfPicture;
    private ArrayList<SDCard> sdCards;
    private PictureFile pictureFile;



    public Camera(int pixel, int weightInKg, String colour, TYPE resolutionOfPicture) {
        this.pixel = pixel;
        this.weightInKg = weightInKg;
        this.colour = colour;
        this.resolutionOfPicture = resolutionOfPicture;
        this.sdCards = new ArrayList<>();

    }

    public void addSDCard(SDCard sdCard){
        this.sdCards.add(sdCard);
    }



    public void takePicture(TYPE resolution){
        PictureFile pictureFile = new PictureFile("PictureNew", "15.83.2004", 0);
        if (resolution == TYPE.small){
            pictureFile.setSizeInMB(2000);
        }
        if (resolution == TYPE.medium){
            pictureFile.setSizeInMB(4000);
        }
        if (resolution == TYPE.large){
            pictureFile.setSizeInMB(6000);
        }


        if (sdCards.size()==0){
            System.out.println("Leider keine SD Karte eingelegt");
            return;
        }

        int sumOfAllFreeSpace = 0;
        for (SDCard card: this.sdCards ) {
            sumOfAllFreeSpace += card.getFreeSpace();
        }

        if (sdCards.get(0).getFreeSpace() > 3000){
            System.out.println("WARNING Capacity almost reached");
            sdCards.get(0).safePicture(pictureFile);
        }
        else {
            System.out.println("cant safe Picture, please insert new sd Card");
        }
    }

    public void getAllFiles() {
        for (int i = 0; i < sdCards.get(0).getPictureFiles().size(); i++) {
            System.out.println(sdCards.get(0).getPictureFiles().get(i).getAllInfo());
        }
    }

    public void insertNewSDCard(SDCard sdCard){
        this.sdCards.add(sdCard);
    }

    public int getPixel() {
        return pixel;
    }

    public int getWeightInKg() {
        return weightInKg;
    }

    public String getColour() {
        return colour;
    }

    public TYPE getResolutionOfPicture() {
        return resolutionOfPicture;
    }

    public ArrayList<SDCard> getSdCards() {
        return sdCards;
    }
}
