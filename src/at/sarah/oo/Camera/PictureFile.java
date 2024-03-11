package at.sarah.oo.Camera;

import at.sarah.oo.examples.cars.Engine;

public class PictureFile {

    private String name;
    private String date;
    private int sizeInMB;

    public PictureFile(String name, String date, int sizeInMB) {
        this.name = name;
        this.date = date;
        this.sizeInMB = sizeInMB;
    }

    public String getAllInfo(){
        return "name: " + name + " date: " + date + " size: " + sizeInMB;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getSizeInMB() {
        return sizeInMB;
    }

    public void setSizeInMB(int sizeInMB) {
        this.sizeInMB = sizeInMB;
    }
}
