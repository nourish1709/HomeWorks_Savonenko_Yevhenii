package homework5;

import java.util.Comparator;

public class NumbersComparator implements Comparator<Number> {
    @Override
    public int compare(Number o1, Number o2) {
        if (o1 instanceof Float || o1 instanceof Double) {
            if ((Double) o1.doubleValue() - (Double) o2.doubleValue() > 0) {
                return 1;
            }
            else if ((Double) o1.doubleValue() - (Double) o2.doubleValue() < 0) {
                return -1;
            }
            return 0;
        }
        if (o1 instanceof Byte || o1 instanceof Short || o1 instanceof Integer || o1 instanceof Long) {
            if ((Long) o1.longValue() - (Long) o2.longValue() > 0) {
                return 1;
            }
            else if ((Long) o1.longValue() - (Long) o2.longValue() < 0) {
                return -1;
            }
            return 0;
        }
        return 0;
    }
    /*Comparator<Number> myComparator = new Comparator<Number>() {
        @Override
        public int compareTo(Number n1, Number n2) {
            // implement logic here.
            // Return -1 if n1 < n2, 0 if n1 = n2, 1 if n1 > n2
        }
    };*/
}
