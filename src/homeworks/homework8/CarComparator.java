package homeworks.homework8;

import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        if (car1.getPrice() - car2.getPrice() > 0)
            return 1;
        else if (car1.getPrice() - car2.getPrice() < 0)
            return -1;
        return 0;
    }
}
