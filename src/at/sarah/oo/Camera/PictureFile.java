package at.sarah.oo.Camera;

import at.sarah.oo.examples.cars.Engine;

public class PictureFile {
    private enum TYPE {small, medium , large}
    private PictureFile.TYPE resolution;

    private String name;
    private String date;
    private String sizeInMB;

    public PictureFile(String name, String date, String sizeInMB) {
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

    public String getSizeInMB() {
        return sizeInMB;
    }
}
