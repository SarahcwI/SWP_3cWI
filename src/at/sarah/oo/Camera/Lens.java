package at.sarah.oo.Camera;

public class Lens {
    private String focalLength;
    private Manufacturer manufacturer;

    public Lens(String focalLength, Manufacturer manufacturer) {
        this.focalLength = focalLength;
        this.manufacturer = manufacturer;
    }

    public String getFocalLength() {
        return focalLength;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }
}
