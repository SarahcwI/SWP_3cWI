package at.sarah.oo.PhoneExercise;

public class PhoneFile {
    private String name;
    private String extension;
    private int sizeInMB;

    public PhoneFile(String name, String extension, int sizeInMB) {
        this.name = name;
        this.extension = extension;
        this.sizeInMB = sizeInMB;
    }

    public String getAllInfo (){
        return name + "." + extension + " " + sizeInMB + "MB";
    }

    public String getName() {
        return name;
    }

    public String getExtension() {
        return extension;
    }

    public int getSizeInMB() {
        return sizeInMB;
    }
}
