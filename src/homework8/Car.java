package homework8;

import java.util.UUID;

public class Car {
    private UUID id;
    private Brand brand;
    private int year;
    private int mileage;
    private int price;

    public void generateCar() {
        this.id = UUID.randomUUID();
        this.brand = CarGenerator.getRandomBrand();
        this.year = CarGenerator.getRandomYear();
        this.mileage = CarGenerator.getRandomMileage();
        this.price = CarGenerator.getRandomPrice();
    }

    public UUID getId() {
        return id;
    }

    public Brand getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car:\t" +
                "id=" + id +
                ",\tbrand = " + brand +
                ",\tyear = " + year +
                ",\tmileage = " + mileage + "km" +
                ",\tprice = " + price + "$";
    }
}
