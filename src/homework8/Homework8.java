package homework8;

import java.util.*;
import java.util.stream.Collectors;

public class Homework8 {

    static Map<UUID, Car> cheapCars;

    public static void main(String[] args) {

        List<Car> cars = new ArrayList<>();
        List<Car> teslaOrAudi = new ArrayList<>();
        List<Car> before2018 = new ArrayList<>();
        List<Car> smallMileage = new ArrayList<>();
        List<Car> carsDesc = new ArrayList<>();

        for (int i = 0; i< 20; i++) {
            cars.add(new Car());
        }

        cars.forEach(Car::generateCar);

        cheapCars = cars.stream().filter(car -> {
            if (car.getBrand() == Brand.TESLA || car.getBrand() == Brand.AUDI) {
                teslaOrAudi.add(car);
                return true;
            }
            return false;
        }).filter(car -> {
            if (car.getYear() >= 2018) {
                before2018.add(car);
                return true;
            }
            else {
                return false;
            }
        }).filter(car -> {
            if (car.getMileage() < 40000) {
                smallMileage.add(car);
                return true;
            }
            else {
                return false;
            }
        }).sorted(new CarComparator().reversed())
                .filter(car -> {
                    carsDesc.add(car);
                    return true;
                }).sorted(new CarComparator())
        .limit(3).collect(
                Collectors.toMap(car -> car.getId(),
                        car -> car));

        System.out.println("Tesla and Audi:");
        for (Car car : teslaOrAudi) {
            System.out.println("\t" + car);
        }

        System.out.println("\nTesla and Audi created before 2018:");
        for (Car car : before2018) {
            System.out.println("\t" + car);
        }

        System.out.println("\nTesla and Audi created before 2018 with a mileage less than 40 000:");
        for (Car car : smallMileage) {
            System.out.println("\t" + car);
        }

        System.out.println("\nTesla and Audi created before 2018 with a mileage less than 40 000 ordered by price in descending order:");
        for (Car car : carsDesc) {
            System.out.println("\t" + car);
        }

        System.out.println("\nThree cheapest cars:");
        for (Map.Entry<UUID, Car> entry : cheapCars.entrySet()) {
            System.out.println("\t" + entry.getValue().toString());
        }
    }
}
