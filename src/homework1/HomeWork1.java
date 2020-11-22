package homework1;

public class HomeWork1 {

    public static void main(String[] args) {
        byte byteValue1 = 45;
        byte byteValue2 = -20;
        short shotValue1 = 164;
        short shortValue2 = 1928;
        long longValue1 = 92186212L;
        long longValue2 = -96414546L;
        double doubleValue1 = 98456.9845647694D;
        double doubleValue2 = -854156.584896465D;
        float floatValue1 = -98614.586455f;
        float floatValue2 = -48156561.5165f;

        byte byteResult = (byte) (byteValue1 + byteValue2 / 10.0);
        short shortResult = (short) ((shotValue1 + shortValue2) / (byteValue2 * byteValue1));
        long longResult = longValue1 * longValue2 - shortValue2 * byteValue1;
        double doubleResult = doubleValue1 / floatValue1 + (doubleValue2 * floatValue1);
        float floatResult = (float) (doubleValue1 / floatValue2 + (floatValue1 - doubleValue2));

        System.out.println(byteValue1 + " + (" + byteValue2 + ") / 10.0 = " + byteResult);
        System.out.println("(" + shotValue1 + " + " + shortValue2 + ") / ((" + byteValue2 + ") * " + byteValue1 + ") = " + shortResult);
        System.out.println(longValue1 + " * (" + longValue2 + ") - " + shortValue2 + " * " + byteValue1 + " = " + longResult);
        System.out.println(doubleValue1 + " / (" + floatValue1 + ") + " + " ((" + doubleValue2 + ") * (" + floatValue1 + ")) = " + doubleResult);
        System.out.println(doubleValue1 + " / (" + floatValue2 + ") + ((" + floatValue1 + ") - (" + doubleValue2 + ")) = " + floatResult);
    }
}