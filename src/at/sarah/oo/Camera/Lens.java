package at.sarah.oo.Camera;

public class Lens {
    private int focalLength;
    private Manufacturer manufacturer;

    public Lens(int focalLength, Manufacturer manufacturer) {
        this.focalLength = focalLength;
        this.manufacturer = manufacturer;
    }

    public int getFocalLength() {
        return focalLength;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }
}
