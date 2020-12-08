package homework8;

import java.security.SecureRandom;
import java.util.UUID;

public class Car {
    private UUID id;
    private Brand brand;
    private int year;
    private int mileage;
    private int price;
    static final SecureRandom random = new SecureRandom();

    public void generateCar() {
        this.id = UUID.randomUUID();
        this.brand = getRandomBrand();
        this.year = getRandomYear();
        this.mileage = getRandomMileage();
        this.price = getRandomPrice();
    }

    private Brand getRandomBrand() {
        Brand[] brands;
        brands = Brand.values();
        return brands[random.nextInt(brands.length)];
    }

    private int getRandomYear() {
        int maxYear = 2020;
        int minYear = 1997;
        return random.nextInt(maxYear-minYear+1)+minYear;
    }

    private int getRandomMileage() {
        int maxMileage = 50000;
        int minMileage = 10000;
        return random.nextInt(maxMileage-minMileage+1)+minMileage;
    }

    private int getRandomPrice() {
        int maxPrice = 100000;
        int minPrice = 2000;
        return random.nextInt(maxPrice-minPrice+1)+minPrice;
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
