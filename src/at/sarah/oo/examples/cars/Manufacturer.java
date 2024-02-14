package at.sarah.oo.examples.cars;

public class Manufacturer {
    private String nameOfManufacturer;
    private String countryOfOrigin;
    private int discount;
    private Car car;

    public Manufacturer(String nameOfManufacturer, String countryOfOrigin, int discount, Car car) {
        this.nameOfManufacturer = nameOfManufacturer;
        this.countryOfOrigin = countryOfOrigin;
        this.discount = discount;
        this.car = car;
    }

    public void discountedPrice(){
        int discountInEuro = car.getBase_price() * this.discount /100;
        int newPrice = car.getBase_price() - discountInEuro;
        System.out.println("The discounted price is " + newPrice + "euros");
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
        System.out.println("This Manufacturer has a Discount of " + this.discount + " %");
        return this.discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
