package homework8;

import java.security.SecureRandom;

public class CarGenerator {
    static final SecureRandom random = new SecureRandom();
    public static Brand getRandomBrand() {
        Brand[] brands;
        brands = Brand.values();
        return brands[random.nextInt(brands.length)];
    }

    public static int getRandomYear() {
        int maxYear = 2020;
        int minYear = 2010;
        return random.nextInt(maxYear-minYear+1)+minYear;
    }

    public static int getRandomMileage() {
        int maxMileage = 50000;
        int minMileage = 10000;
        return random.nextInt(maxMileage-minMileage+1)+minMileage;
    }

    public static int getRandomPrice() {
        int maxPrice = 100000;
        int minPrice = 2000;
        return random.nextInt(maxPrice-minPrice+1)+minPrice;
    }
}
