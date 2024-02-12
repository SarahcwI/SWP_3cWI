package at.sarah.oo.examples.cars;

public class Manufacturer {
    private String nameOfManufacturer;
    private String countryOfOrigin;
    private int discount;

    public Manufacturer(String nameOfManufacturer, String countryOfOrigin, int discount) {
        this.nameOfManufacturer = nameOfManufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.discount = discount;
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public void setNameOfManufacturer(String nameOfManufacturer) {
        this.nameOfManufacturer = nameOfManufacturer;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
