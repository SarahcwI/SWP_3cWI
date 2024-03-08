package at.sarah.oo.Camera;

import java.util.ArrayList;

public class SDCard {
    private ArrayList <PictureFile> pictureFiles;
    private int capacity;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.pictureFiles = new ArrayList<>();
    }

    public void safePicture(PictureFile pictureFile){
        this.pictureFiles.add(pictureFile);
    }
    
    public int getFreeSpace(){
        int sum = 0;
        for (PictureFile pictureFile:pictureFiles) {
            sum += pictureFile.getSizeInMB();
        }
        return capacity - sum;
    }

    public int getCapacity() {
        return capacity;
    }
}
